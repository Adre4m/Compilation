package ast.types;

import ast.Type;

/**
 * Created by o2132140 on 23/03/17.
 */
public class Var extends Type {

    private String name;

    public Var(Position pos, String name) {
        super(pos);
        this.name = name;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"" + name + "\"];\n";
    }

    public String getName() {
        return name;
    }
}
