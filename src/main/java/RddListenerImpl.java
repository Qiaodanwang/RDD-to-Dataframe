public class RddListenerImpl extends RddBaseListener {

    private StartCtxTransformer transformer;
    public String outPut(){
        if (transformer == null) return "not parsed!";
        return transformer.transform();
    }

    @Override
    public void exitStart(RddParser.StartContext ctx) {
        transformer = new StartCtxTransformer(ctx);
    }

    class StartCtxTransformer{
        private RddParser.StartContext ctx;
        StartCtxTransformer(RddParser.StartContext ctx){
            this.ctx = ctx;
        }


        String transform() {
            MapopsCtxTransformer mapopsCtxTransformer = new MapopsCtxTransformer(ctx.mapops());
            return "spark"
                    + String.format(".range(%s, %s).selectExpr(\"id as _1\")", ctx.NUMBER(0), ctx.NUMBER(1))
                    + mapopsCtxTransformer.transform()
                    + ".collect()";

        }
    }

    class MapopsCtxTransformer{
        private RddParser.MapopsContext ctx;
        private String mapOpsParam = "";
        MapopsCtxTransformer(RddParser.MapopsContext ctx){
            this.ctx = ctx;
        }

        String transform() {
            //epsilon
            if(ctx.getChildCount()==0){
                return "";
            }
            MapopsCtxTransformer mapopsCtxTransformer = new MapopsCtxTransformer(ctx.mapops());
            UdfCtxTranformer udfCtxTranformer = new UdfCtxTranformer(ctx.udf(),mapOpsParam);

            return mapopsCtxTransformer.transform() + String.format(".selectExpr(%s)",udfCtxTranformer.transform());
        }
    }

    class UdfCtxTranformer{
        private RddParser.UdfContext ctx;
        private String udfParam;
        UdfCtxTranformer(RddParser.UdfContext ctx, String param){
            this.ctx = ctx;
            this.udfParam = param;
        }

        String transform() {
            udfParam = ctx.ID().getText();
            ExprCtxTransformer exprCtxTransformer = new ExprCtxTransformer(ctx.expression(),udfParam);
            return exprCtxTransformer.transform();

        }
    }

    class ExprCtxTransformer{
        private RddParser.ExpressionContext ctx;
        private String exprParam;
        ExprCtxTransformer(RddParser.ExpressionContext ctx, String param){
            this.ctx = ctx;
            this.exprParam = param;
        }

        String transform() {
            if(ctx.complexexpression() == null){
                SimpleExprCtxTransformer simpleExprCtxTransformer = new SimpleExprCtxTransformer(ctx.simpleexpression(), exprParam);
                return simpleExprCtxTransformer.transform();
            }
            ComplexExprCtxTransformer complexExprCtxTransformer = new ComplexExprCtxTransformer(ctx.complexexpression(), exprParam);
            return complexExprCtxTransformer.transform();
        }
    }

    class SimpleExprCtxTransformer{
        private RddParser.SimpleexpressionContext ctx;
        private String simpleExprParam;
        SimpleExprCtxTransformer(RddParser.SimpleexpressionContext ctx, String param){
            this.ctx = ctx;
            this.simpleExprParam = param;
        }

        String transform() {
            if(ctx.pureexpression() == null){
                TupleExprCtxTransformer tupleExprCtxTransformer = new TupleExprCtxTransformer(ctx.tupleexpression(), simpleExprParam);
                return String.format("\"%s as _1\"", tupleExprCtxTransformer.transform());
            }
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(), simpleExprParam);
            return String.format("\"%s as _1\"", pureExprCtxTransformer.transfrom());
        }
    }

    class TupleExprCtxTransformer{
        private RddParser.TupleexpressionContext ctx;
        private String tupleExprParam;
        private int asId = 1;
        TupleExprCtxTransformer(RddParser.TupleexpressionContext ctx, String param){
            this.ctx = ctx;
            this.tupleExprParam = param;
        }

        String transform() {
            if(ctx.tupleexpression() == null){
                PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(0),tupleExprParam);
                PureExprCtxTransformer pureExprCtxTransformer2 = new PureExprCtxTransformer(ctx.pureexpression(1),tupleExprParam);
                return String.format("%s as _%d, %s as _%d", pureExprCtxTransformer1.transfrom(), asId++, pureExprCtxTransformer2.transfrom(), asId++);
            }

            TupleExprCtxTransformer tupleExprCtxTransformer = new TupleExprCtxTransformer(ctx.tupleexpression(), tupleExprParam);
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), tupleExprParam);

            return String.format("%s, %s as _%d", tupleExprCtxTransformer.transform(), pureExprCtxTransformer.transfrom(), asId++);
        }
    }

    class ComplexExprCtxTransformer{
        private RddParser.ComplexexpressionContext ctx;
        private String complexExprParam;
        ComplexExprCtxTransformer(RddParser.ComplexexpressionContext ctx, String param){
            this.ctx = ctx;
            this.complexExprParam = param;
        }

        String transform() {
            if (ctx.simpleexpression()!=null){
                SimpleExprCtxTransformer simpleExprCtxTransformer = new SimpleExprCtxTransformer(ctx.simpleexpression(), complexExprParam);
                return simpleExprCtxTransformer.transform();
            }
            return "";

        }
    }

    class PureExprCtxTransformer{
        private RddParser.PureexpressionContext ctx;
        private String pureExprParam;
        PureExprCtxTransformer(RddParser.PureexpressionContext ctx, String param){
            this.ctx = ctx;
            this.pureExprParam = param;
        }

        String transfrom() {
            if(ctx.IF()!=null) {
                CompExprCtxTranformer compExprCtxTranformer = new CompExprCtxTranformer(ctx.comparisonexpression(), pureExprParam);
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), pureExprParam);
                PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), pureExprParam);
                return String.format("if(%s) %s else %s", compExprCtxTranformer.transform(), pureExprCtxTransformer.transfrom(), pureExprCtxTransformer1.transfrom());
            }
            //NUMBER
            if(ctx.NUMBER() != null){
                return ctx.NUMBER().getText();
            }
            //ID DOT ID
            else if(ctx.ID(0)!=null && ctx.DOT()!=null){
                if(pureExprParam.equals("1")){
                    return "_1";
                }
                return "_2";
            }
            //ID
            else if(ctx.ID()!=null && ctx.OP() == null){
                if(pureExprParam.equals("1")){
                    return "_1";
                }
                return "_2";
            }
            //(pureexpression)
            else if(ctx.LP()!=null && ctx.pureexpression(0)!=null && ctx.pureexpression(1)==null){
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), pureExprParam);
                return String.format("(%s)", pureExprCtxTransformer.transfrom());
            }
            //pureexpression OP pureexpression
            else if(ctx.pureexpression(0)!=null && ctx.OP()!=null && ctx.pureexpression(1)!=null){
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), "1");
                PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), "2");
                return String.format("%s %s %s", pureExprCtxTransformer.transfrom(),ctx.OP().getText(),pureExprCtxTransformer1.transfrom());
            }
            return "";
            //IF LP comparisonexpression RP pureexpression ELSE pureexpression
            //else
        }
    }

    class CompExprCtxTranformer{
        private RddParser.ComparisonexpressionContext ctx;
        private String CompExprParam;
        CompExprCtxTranformer(RddParser.ComparisonexpressionContext ctx, String param){
            this.ctx = ctx;
            this.CompExprParam = param;
        }

        String transform(){
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), CompExprParam);
            PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), CompExprParam);
            return String.format("%s %s %s", pureExprCtxTransformer.transfrom(), ctx.COMP().getText(),pureExprCtxTransformer1.transfrom());
        }
    }
}
