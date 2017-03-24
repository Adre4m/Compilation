package ast;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Comp extends Ast {

    private String comparator;

    public Comp(Position pos, String comparator) {
        super(pos);
        this.comparator = comparator;
    }

    @Override
    public String toDot() {
        return comparator;
    }
}
