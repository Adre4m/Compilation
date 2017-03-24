package ast.bodies.stmts;

import ast.bodies.Stmt;
import ast.types.Var;

/**
 * Created by o2132140 on 23/03/17.
 */
public class Decrement extends Stmt {

    private Var var;

    public Decrement(Position pos, Var var) {
        super(pos);
        this.var = var;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"--\"];\n" + var.toDot() + dotTag() + " -> " + var.dotTag() + ";\n";
    }
}
