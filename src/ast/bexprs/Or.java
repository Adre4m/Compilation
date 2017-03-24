package ast.bexprs;

import ast.BExpr;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Or extends BExpr {

    private BExpr left;
    private BExpr right;

    public Or(Position pos, BExpr left, BExpr right) {
        super(pos);
        this.left = left;
        this.right = right;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"or\"];\n");
        sb.append(left.toDot()).append(dotTag()).append(" -> ").append(left.dotTag()).append(";\n");
        sb.append(right.toDot()).append(dotTag()).append(" -> ").append(right.dotTag()).append(";\n");
        return sb.toString();
    }
}
