package ast;

import java.util.ArrayList;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Lang extends Ast {

    private ArrayList<Body> bodies;

    public Lang(Position pos, ArrayList<Body> bodies) {
        super(pos);
        this.bodies = bodies;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder(dotTag() + " [label=\"body\"];\n");
        for (Body body : bodies)
            sb.append(body.toDot()).append(dotTag()).append(" -> ").append(body.dotTag()).append(";\n");
        return sb.toString();
    }
}
