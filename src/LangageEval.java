/**
 * Created by o2132140 on 31/01/17.
 */
public class LangageEval extends LangageBaseVisitor<String> {

    /*private static int tabs = 2;

    private void tabulate(StringBuilder sb) {
        for (int i = 0; i < tabs; ++i)
            sb.append("\t");
    }

    @Override
    public String visitCond(LangageParser.CondContext ctx) {
        StringBuilder sb = new StringBuilder();
        tabulate(sb);
        String ifE = visit(ctx.ifE);
        sb.append("if (").append(ifE).append(") {\n");
        tabs++;
        sb.append(visit(ctx.ifB)).append("\n");
        tabs--;
        tabulate(sb);
        sb.append("} ");
        if (ctx.eliE != null) {
            sb.append("else if (").append(visit(ctx.eliE)).append(") {\n");
            tabs++;
            sb.append(visit(ctx.eliB)).append("\n");
            tabs--;
            tabulate(sb);
            sb.append("} ");
        }
        if (ctx.elB != null) {
            sb.append("else {\n");
            tabs++;
            sb.append(visit(ctx.elB)).append("\n");
            tabs--;
            tabulate(sb);
            sb.append("}");
        }
        return sb.toString();
    }

    @Override
    public String visitTrue(LangageParser.TrueContext ctx) {
        return "true";
    }

    @Override
    public String visitFalse(LangageParser.FalseContext ctx) {
        return "false";
    }

    @Override
    public String visitNot(LangageParser.NotContext ctx) {
        return "!" + visit(ctx.bexp());
    }

    @Override
    public String visitOr(LangageParser.OrContext ctx) {
        return visit(ctx.lor) + " || " + visit(ctx.ror);
    }

    @Override
    public String visitAnd(LangageParser.AndContext ctx) {
        return visit(ctx.land) + " && " + visit(ctx.rand);
    }

    @Override
    public String visitCompare(LangageParser.CompareContext ctx) {
        return visit(ctx.left) + visit(ctx.comp()) + visit(ctx.right);
    }

    @Override
    public String visitDecrementA(LangageParser.DecrementAContext ctx) {
        return ctx.VAR().getText() + "--;";
    }

    @Override
    public String visitIncrementA(LangageParser.IncrementAContext ctx) {
        return ctx.VAR().getText() + "++;";
    }

    @Override
    public String visitIncrementB(LangageParser.IncrementBContext ctx) {
        return "++" + ctx.VAR().getText() + ";";
    }

    @Override
    public String visitDecrementB(LangageParser.DecrementBContext ctx) {
        return "--" + ctx.VAR().getText() + ";";
    }

    @Override
    public String visitComp(LangageParser.CompContext ctx) {
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitInt(LangageParser.IntContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOp(LangageParser.OpContext ctx) {
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitX(LangageParser.XContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitChar(LangageParser.CharContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFloat(LangageParser.FloatContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperation(LangageParser.OperationContext ctx) {
        return visit(ctx.left) + visit(ctx.op()) + visit(ctx.right);
    }

    @Override
    public String visitLoop(LangageParser.LoopContext ctx) {
        StringBuilder sb = new StringBuilder();
        tabulate(sb);
        sb.append("while (").append(visit(ctx.bexp())).append(") {\n");
        tabs++;
        tabulate(sb);
        sb.append(visit(ctx.lang())).append("\n");
        tabs--;
        tabulate(sb);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String visitAffectExpr(LangageParser.AffectExprContext ctx) {
        StringBuilder sb = new StringBuilder();
        tabulate(sb);
        sb.append(ctx.VAR().getText()).append(" = ").append(visit(ctx.expr())).append(";");
        return sb.toString();
    }

    @Override
    public String visitAffectBool(LangageParser.AffectBoolContext ctx) {
        return "bool " + visit(ctx.VAR()) + " = " + visit(ctx.bexp()) + ";";
    }

    @Override
    public String visitString(LangageParser.StringContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLang(LangageParser.LangContext ctx) {
        return super.visitLang(ctx);
    }

    @Override
    public String visitProg(LangageParser.ProgContext ctx) {
        return "public class Test {\n\n" +
                "\tpublic static void main(String[] args) {\n" +
                visit(ctx.lang()) +
                "\n\t}" +
                "\n}";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null)
            return nextResult;
        if (nextResult == null)
            return aggregate;
        StringBuilder sb = new StringBuilder(aggregate);
        sb.append(" ");
        sb.append(nextResult);
        return sb.toString();
    }*/
}
