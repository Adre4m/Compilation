package ast.bodies.loops;

import ast.BExpr;
import ast.Lang;
import ast.bodies.Loop;

/**
 * Created by o2132140 on 24/03/17.
 */
public class While extends Loop {


    private BExpr condition;
    private Lang body;

    public While(Position pos, BExpr condition, Lang body) {
        super(pos);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"while\"];\n");
        sb.append(condition.toDot()).append(dotTag()).append(" -> ").append(condition.dotTag()).append(";\n");
        sb.append(body.toDot()).append(dotTag()).append(" -> ").append(body.dotTag()).append(";\n");
        int endId = getFreshId();
        sb.append(endId).append(" [label=\"end\"];\n").append(dotTag()).append(" -> ").append(endId).append(";\n");
        return sb.toString();
    }
}
