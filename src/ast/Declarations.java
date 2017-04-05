package ast;

import ast.types.Var;

/**
 * Created by willi on 03/04/2017.
 */
public class Declarations extends Ast {
    private Var name;
    private Types types;

    public Declarations(Position pos, Var name,Types types){
        super(pos);
        this.name = name;
        this.types = types;
    }

    @Override
    public String toDot() {
        final StringBuilder sb = new StringBuilder(dotTag() + " [label=\"declarations\"];\n");
        sb.append(name.toDot()).append(dotTag()).append(" -> ").append(name.dotTag()).append(";\n");
        sb.append(types.toDot()).append(dotTag()).append(" -> ").append(types.dotTag()).append(";\n");
        return sb.toString();
    }
}
