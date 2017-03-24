package ast.bexprs;

import ast.BExpr;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Not extends BExpr {

    private BExpr not;

    public Not(Position pos, BExpr not) {
        super(pos);
        this.not = not;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"not\"];\n");
        sb.append(not.toDot()).append(dotTag()).append(" -> ").append(not.dotTag()).append(";\n");
        return sb.toString();
    }
}
