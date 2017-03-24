package ast.coordinator;

import ast.Expr;

/**
 * Created by o2132140 on 23/03/17.
 */
public class Operation extends Expr {

    private Expr left;
    private Expr right;
    private Operator operator;

    public Operation(Position pos, Expr left, Expr right, Operator operator) {
        super(pos);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"" + operator.toDot() + "\"];\n");
        sb.append(left.toDot()).append(dotTag()).append(" -> ").append(left.dotTag()).append(";\n");
        sb.append(right.toDot()).append(dotTag()).append(" -> ").append(right.dotTag()).append(";\n");
        return sb.toString();
    }
}
