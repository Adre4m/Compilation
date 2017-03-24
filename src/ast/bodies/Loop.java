package ast.bodies;

import ast.BExpr;
import ast.Body;
import ast.Expr;
import ast.Lang;

/**
 * Created by o2132140 on 22/03/17.
 */
public abstract class Loop extends Body {

    protected Loop(Position pos) {
        super(pos);
    }
}
