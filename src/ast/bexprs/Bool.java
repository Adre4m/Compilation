package ast.bexprs;

import ast.BExpr;

/**
 * Created by o2132140 on 24/03/17.
 */
public class Bool extends BExpr {

    private boolean value;

    public Bool(Position pos, boolean value) {
        super(pos);
        this.value = value;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"" + value + "\"];\n";
    }
}
