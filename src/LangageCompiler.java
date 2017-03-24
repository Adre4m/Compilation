import ast.Ast;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;


/**
 * Created by fredericdabrowski on 25/01/2017.
 */


public class LangageCompiler {

    public static void main(String args[]) {
        try {
            Scanner file = new Scanner(new File("test.txt"));
            StringBuilder sb = new StringBuilder();
            while(file.hasNextLine()) {
                sb.append(file.nextLine()).append("\n");
            }

            LangageLexer lexer = new LangageLexer(new ANTLRInputStream(sb.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LangageParser parser = new LangageParser(tokens);
            PrintStream ost = new PrintStream(new File("test.dot"));
            ost.println(new AstBuilder().visit(parser.prog()).toDot());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
