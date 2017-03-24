package ast.types;

import ast.Type;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Number extends Type {

    private float value;

    public Number(Position pos, float value) {
        super(pos);
        this.value = value;
    }

    @Override
    public String toDot() {
        return dotTag() + " [label=\"" + value + "\"];\n";
    }
}
