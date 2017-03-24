package ast.bodies;

import ast.Body;

/**
 * Created by o2132140 on 22/03/17.
 */
public abstract class Stmt extends Body {

    protected Stmt(Position pos) {
        super(pos);
    }
}
