package ast.types;

import ast.Type;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Floatt extends Type {

    private String value;

    public Floatt(final Position pos,final String value) {
        super(pos);
        this.value = value;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"" + value + "\"];\n";
    }
}
