package ast.bodies.stmts;

import ast.bodies.Stmt;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Skip extends Stmt {
    public Skip(Position pos) {
        super(pos);
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"skip\"];\n";
    }
}
