package antlr.bits;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class App {

    public static void printOutput(String input) {

        CharStream charStream = CharStreams.fromString(input);
        Assignment1Lexer lexer = new Assignment1Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Assignment1Parser parser = new Assignment1Parser(tokens);

        ParseTree tree = parser.test();
        System.out.println();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Assignment1BaseListener(), tree);
    }

    public static void main(String[] args) throws IOException {
        // Examples in the description
        printOutput("11010");
        printOutput("101111110");
        printOutput("0");
        printOutput("11");
    }
}
