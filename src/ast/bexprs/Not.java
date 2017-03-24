package ast.bexprs;

import ast.BExpr;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Not extends BExpr {

    protected Not(Position pos) {
        super(pos);
    }

    @Override
    public String toDot() {
        return null;
    }
}
