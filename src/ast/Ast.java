package ast;

/**
 * Created by o2132140 on 22/03/17.
 */
public abstract class Ast {

    public static class Position {

        private int line;
        private int col;

        public Position(int line, int col)
        {

            this.line = line;
            this.col = col;

        }

        public String toString() {

            return "[line:" + line + ", col:" + col + ']';

        }

    }

    protected Position pos;

    private static int count = 0;

    public static int getFreshId() {
        return count++;
    }

    private int id;

    protected Ast(Position pos) {
        this.pos = pos;
        id = count++;
    }

    public abstract String toDot();

    public String dotTag() {
        return String.valueOf(id);
    }
}
