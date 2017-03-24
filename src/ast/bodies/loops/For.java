package ast.bodies.loops;

import ast.BExpr;
import ast.Lang;
import ast.bodies.Loop;
import ast.bodies.Stmt;

/**
 * Created by o2132140 on 24/03/17.
 */
public class For extends Loop {

    private Stmt inst;
    private Stmt variation;
    private BExpr condition;
    private Lang body;

    public For(Position pos, Stmt inst, Stmt variation, BExpr condition, Lang body) {
        super(pos);
        this.inst = inst;
        this.variation = variation;
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"for\"];\n");
        sb.append(inst.toDot()).append(dotTag()).append(" -> ").append(inst.dotTag()).append(";\n");
        sb.append(condition.toDot()).append(dotTag()).append(" -> ").append(condition.dotTag()).append(";\n");
        sb.append(variation.toDot()).append(dotTag()).append(" -> ").append(variation.dotTag()).append(";\n");
        sb.append(body.toDot()).append(dotTag()).append(" -> ").append(body.dotTag()).append(";\n");
        int endId = getFreshId();
        sb.append(endId).append(" [label=\"end\"];\n").append(dotTag()).append(" -> ").append(endId).append(";\n");
        return sb.toString();
    }
}
