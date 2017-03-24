package ast.bodies;

import ast.*;
import ast.bodies.Conds.CondElse;
import ast.bodies.Conds.CondElseIf;

import java.util.ArrayList;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Cond extends Body {

    private BExpr expr;
    private Lang thenBlock;
    private ArrayList<CondElseIf> elseIfs;
    private CondElse elseBlock;

    public Cond(Position pos, BExpr expr, Lang thenBlock, ArrayList<CondElseIf> elseIfs, CondElse elseBlock) {
        super(pos);
        this.expr = expr;
        this.thenBlock = thenBlock;
        this.elseIfs = elseIfs;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"if\"];\n");
        sb.append(expr.toDot()).append(dotTag()).append(" -> ").append(expr.dotTag()).append(";\n");
        sb.append(thenBlock.toDot()).append(dotTag()).append(" -> ").append(thenBlock.dotTag()).append(";\n");
        for (CondElseIf elseIf : elseIfs) {
            sb.append(elseIf.toDot()).append(dotTag()).append(" -> ").append(elseIf.dotTag()).append(";\n");
        }
        if (elseBlock != null) {
            sb.append(elseBlock.toDot()).append(dotTag()).append(" -> ").append(elseBlock.dotTag()).append(";\n");
        }
        int endId = getFreshId();
        sb.append(endId).append(" [label=\"end\"];\n").append(dotTag()).append(" -> ").append(endId).append(";\n");
        return sb.toString();
    }
}
