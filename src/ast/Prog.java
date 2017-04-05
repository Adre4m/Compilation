package ast;

import java.util.ArrayList;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Prog extends Ast {

    private Lang body;
    private ArrayList<Declarations> declarations;

    public Prog(Position pos, Lang body,ArrayList<Declarations> declarations) {
        super(pos);
        this.body = body;
        this.declarations = declarations;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder("digraph graphname {\n");
        sb.append(dotTag()).append(" [label=\"prog\"];\n");
        for(Declarations decl : declarations){
            sb.append(decl.toDot()).append(dotTag()).append(" -> ").append(decl.dotTag()).append(";\n");
        }
        sb.append(body.toDot()).append(dotTag()).append(" -> ").append(body.dotTag()).append(";\n");
        return sb.append("}").toString();
    }
}
