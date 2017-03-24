package ast.bexprs;

import ast.BExpr;

/**
 * Created by o2132140 on 22/03/17.
 */
public class False extends BExpr {

    protected False(Position pos) {
        super(pos);
    }

    @Override
    public String toDot() {
        return null;
    }
}
