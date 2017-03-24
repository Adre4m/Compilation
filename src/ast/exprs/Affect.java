package ast.exprs;

import ast.Ast;
import ast.Expr;
import ast.bodies.Stmt;
import ast.types.Var;

/**
 * Created by o2132140 on 24/03/17.
 */
public class Affect extends Stmt {

    private Ast expr;
    private Var variable;

    public Affect(Position pos, Ast expr, Var variable) {
        super(pos);
        this.expr = expr;
        this.variable = variable;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"affect\"];\n");
        sb.append(variable.toDot()).append(dotTag()).append(" -> ").append(variable.dotTag()).append(";\n");
        sb.append(expr.toDot()).append(dotTag()).append(" -> ").append(expr.dotTag()).append(";\n");
        return sb.toString();
    }
}
