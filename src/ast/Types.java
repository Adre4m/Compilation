package ast;

/**
 * Created by willi on 03/04/2017.
 */
public class Types extends Body {
    private String types;

    public Types(Position pos, String types) {
        super(pos);
        this.types = types;
    }

    @Override
    public String toDot() {
            return dotTag() + " [label=\"" + types + "\"];\n";
        }

}
