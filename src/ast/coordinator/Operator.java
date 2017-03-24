package ast.coordinator;

import ast.Ast;

/**
 * Created by o2132140 on 24/03/17.
 */
public class Operator extends Ast {

    private Op operator;

    public Operator(Position pos, String operator) {
        super(pos);
        this.operator = Op.getValue(operator);
    }

    @Override
    public String toDot() {
        return operator.toString();
    }
}
