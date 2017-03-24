import ast.*;
import ast.bexprs.Compare;
import ast.bexprs.Bool;
import ast.bodies.Cond;
import ast.bodies.Conds.CondElse;
import ast.bodies.Conds.CondElseIf;
import ast.bodies.Stmt;
import ast.bodies.loops.For;
import ast.bodies.loops.While;
import ast.bodies.stmts.Decrement;
import ast.bodies.stmts.Increment;
import ast.bodies.stmts.Skip;
import ast.coordinator.Operation;
import ast.coordinator.Operator;
import ast.exprs.Affect;
import ast.types.Number;
import ast.types.Var;
import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.ParserRuleContext;
import ast.Ast.Position;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by o2132140 on 17/02/17.
 */
public class AstBuilder extends LangageBaseVisitor<Ast> {

    @Contract("_ -> !null")
    public static Position position(@NotNull ParserRuleContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public Ast visitOp(@NotNull LangageParser.OpContext ctx) {
        return new Operator(position(ctx), ctx.getText());
    }

    @Override
    public Ast visitLang(@NotNull LangageParser.LangContext ctx) {
        ArrayList<Body> bodies = new ArrayList<>();
        bodies.addAll(ctx.cond().stream().map(cond -> (Body) visit(cond)).collect(Collectors.toList()));
        bodies.addAll(ctx.stmt().stream().map(stmt -> (Body) visit(stmt)).collect(Collectors.toList()));
        bodies.addAll(ctx.loop().stream().map(loop -> (Body) visit(loop)).collect(Collectors.toList()));
        return new Lang(position(ctx), bodies);
    }

    @Override
    public Ast visitProg(@NotNull LangageParser.ProgContext ctx) {
        return new Prog(position(ctx), (Lang) visit(ctx.lang()));
    }

    @Override
    public Ast visitSkip(@NotNull LangageParser.SkipContext ctx) {
        return new Skip(position(ctx));
    }


    @Override
    public Ast visitCond(LangageParser.CondContext ctx) {
        BExpr ifE = (BExpr) visit(ctx.ifE);
        Lang ifB = (Lang) visit(ctx.ifB);
        CondElse elseB = null;
        if (ctx.elseCond() != null) {
            elseB = (CondElse) visit(ctx.elseCond());
        }
        return new Cond(position(ctx), ifE, ifB, elseB);
    }

    @Override
    public Ast visitCompare(LangageParser.CompareContext ctx) {
        Expr left = (Expr) visit(ctx.left);
        Expr right = (Expr) visit(ctx.right);
        Comp comp = (Comp) visit(ctx.comp());
        return new Compare(position(ctx), left, right, comp);
    }

    @Override
    public Ast visitComp(LangageParser.CompContext ctx) {
        return new Comp(position(ctx), ctx.getText());
    }

    @Override
    public Ast visitNumber(LangageParser.NumberContext ctx) {
        return new Number(position(ctx), Float.parseFloat(ctx.getText()));
    }

    @Override
    public Ast visitVariable(LangageParser.VariableContext ctx) {
        return new Var(position(ctx), ctx.getText());
    }

    @Override
    public Ast visitElseCond(LangageParser.ElseCondContext ctx) {
        return new CondElse(position(ctx), (Lang) visit(ctx.lang()));
    }

    @Override
    public Ast visitWhile(LangageParser.WhileContext ctx) {
        return new While(position(ctx), (BExpr) visit(ctx.bexp()), (Lang) visit(ctx.lang()));
    }

    @Override
    public Ast visitOperation(LangageParser.OperationContext ctx) {
        return new Operation(position(ctx), (Expr) visit(ctx.left), (Expr) visit(ctx.right), (Operator) visit(ctx.op()));
    }

    @Override
    public Ast visitFor(LangageParser.ForContext ctx) {
        return new For(position(ctx), (Stmt) visit(ctx.init), (Stmt) visit(ctx.incr), (BExpr) visit(ctx.bexp()), (Lang) visit(ctx.lang()));
    }

    @Override
    public Ast visitIncrementVar(LangageParser.IncrementVarContext ctx) {
        return new Increment(position(ctx), (Var) visit(ctx.variable()));
    }

    @Override
    public Ast visitDecrementVar(LangageParser.DecrementVarContext ctx) {
        return new Decrement(position(ctx), (Var) visit(ctx.variable()));
    }

    @Override
    public Ast visitAffectExpr(LangageParser.AffectExprContext ctx) {
        return new Affect(position(ctx), visit(ctx.expr()), (Var) visit(ctx.variable()));
    }

    @Override
    public Ast visitAffectBool(LangageParser.AffectBoolContext ctx) {
        return new Affect(position(ctx), visit(ctx.bexp()), (Var) visit(ctx.variable()));
    }

    @Override
    public Ast visitBoolean(LangageParser.BooleanContext ctx) {
        return new Bool(position(ctx), Boolean.valueOf(ctx.getText()));
    }


}
