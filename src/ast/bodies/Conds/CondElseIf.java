package ast.bodies.Conds;

import ast.Ast;
import ast.BExpr;
import ast.Inst;
import ast.Lang;
import ast.bodies.Stmt;

import java.util.ArrayList;

/**
 * Created by o2132140 on 22/03/17.
 */
public class CondElseIf extends Ast {

    private Lang inst;
    private BExpr expr;

    public CondElseIf(Position pos, BExpr expr, Lang inst) {
        super(pos);
        this.expr = expr;
        this.inst = inst;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"else if\"];\n");
        sb.append(expr.toDot()).append(dotTag()).append(" -> ").append(expr.dotTag()).append(";\n");
        sb.append(inst.toDot()).append(dotTag()).append(" -> ").append(inst.dotTag()).append(";\n");
        return sb.toString();
    }
}
