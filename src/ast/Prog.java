package ast;

/**
 * Created by o2132140 on 22/03/17.
 */
public class Prog extends Ast {

    private Lang body;
    private Declarations declarations;

    public Prog(Position pos, Lang body,Declarations declarations) {
        super(pos);
        this.body = body;
        this.declarations = declarations;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder("digraph graphname {\n");
        sb.append(dotTag()).append(" [label=\"prog\"];\n");
        sb.append(body.toDot()).append(dotTag()).append(" -> ").append(body.dotTag()).append(";\n");
        sb.append(declarations.toDot()).append(dotTag()).append(" -> ").append(declarations.dotTag()).append(";\n");
        return sb.append("}").toString();
    }
}
