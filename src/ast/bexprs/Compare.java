package ast.bexprs;

import ast.BExpr;
import ast.Expr;
import ast.Comp;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Compare extends BExpr {

    private Expr left;
    private Expr right;
    private Comp comp;

    public Compare(Position pos, Expr left, Expr right, Comp comp) {
        super(pos);
        this.left = left;
        this.right = right;
        this.comp = comp;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\""+ comp.toDot() + "\"];\n");
        sb.append(left.toDot()).append(dotTag()).append(" -> ").append(left.dotTag()).append(";\n");
        sb.append(right.toDot()).append(dotTag()).append(" -> ").append(right.dotTag()).append(";\n");
        return sb.toString();
    }
}
