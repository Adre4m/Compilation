package ast;

import java.util.ArrayList;

/**
 * Created by willi on 03/04/2017.
 */
public class Declarations extends Ast {
    private ArrayList<Ast> name;
    private ArrayList<Body> types;

    public Declarations(Position pos, ArrayList<Ast> name,ArrayList<Body> types){
        super(pos);
        this.name = name;
        this.types = types;
    }

    @Override
    public String toDot() {
        final StringBuilder sb = new StringBuilder(dotTag() + " [label=\"declarations\"];\n");
        for (int x = 0;x<name.size();x++) {
            sb.append(name.get(x).toDot()).append(dotTag()).append(" -> ").append(name.get(x).dotTag()).append(";\n");
            sb.append(types.get(x).toDot()).append(dotTag()).append(" -> ").append(types.get(x).dotTag()).append(";\n");
        }
        return sb.toString();
    }
}
