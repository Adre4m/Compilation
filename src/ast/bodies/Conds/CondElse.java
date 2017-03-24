package ast.bodies.Conds;

import ast.Ast;
import ast.BExpr;
import ast.Body;
import ast.Lang;
import ast.bodies.Cond;
import ast.bodies.Stmt;

import java.util.ArrayList;

/**
 * Created by o2132140 on 23/03/17.
 */
public class CondElse extends Body {

    private Lang block;

    public CondElse(Position pos, Lang block) {
        super(pos);
        this.block = block;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"else\"];\n" + block.toDot() + dotTag() + " -> " + block.dotTag() + ";\n";
    }
}
