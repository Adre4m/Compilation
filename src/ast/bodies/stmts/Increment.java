package ast.bodies.stmts;

import ast.Ast;
import ast.bodies.Stmt;
import ast.types.Var;

/**
 * Created by o2132140 on 23/03/17.
 */
public class Increment extends Stmt {

    private Var var;

    public Increment(Position pos, Var var) {
        super(pos);
        this.var = var;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"++\"];\n" + var.toDot() + dotTag() + " -> " + var.dotTag() + ";\n";
    }
}
