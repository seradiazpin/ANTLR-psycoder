/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/test.psy"};
        }

        System.out.println("parsing: " + args[0]);

        // create a CharStream that reads from standard input
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        PsycoderLexer lexer = new PsycoderLexer(new ANTLRFileStream(args[0]));
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        PsycoderParser parser = new PsycoderParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at init rule
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
        // Create a generic parse tree walker that can trigger callbacks
        //ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        //walker.walk(new PsycoderBaseListener(), tree);
        System.out.println("EXIT"); // print a \n after translation
    }
}
