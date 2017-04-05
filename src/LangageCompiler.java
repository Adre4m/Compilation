import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;


/**
 * Created by fredericdabrowski on 25/01/2017.
 */


public class LangageCompiler {

    private static final Logger LOG = Logger.getGlobal();

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
            LOG.info("FINISH : La compilation de votre programme c'est déroulé avec succès !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(RuntimeException e2){
            // Runtime : C'est pour chopper tout les problèmes tels que les NullPoiner ou les divisions par 0 ...
        }
        catch(Exception e4){

        }
    }

}
