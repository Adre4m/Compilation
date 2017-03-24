package ast.coordinator;

import com.sun.istack.internal.NotNull;

/**
 * Created by o2132140 on 24/03/17.
 */
public enum Op {
    PLUS("add"), MINUS("sub"), MUL("mult"), DIV("div"), MOD("rem");

    private String value;
    Op(String value) {
        this.value = value;
    }

    public static Op getValue(@NotNull String value) {
        switch(value) {
            case "+" :
                return PLUS;
            case "-" :
                return MINUS;
            case "*" :
                return MUL;
            case "/" :
                return DIV;
            case "%" :
                return MOD;
        }
        return null;
    }

    public String toString() {
        return this.value;
    }
}
