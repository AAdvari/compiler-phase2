package parser.src;

import java.io.*;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputCoolFilePath = "parser/app.cool";
        String outputFilePath = " ";
//        String tablePath = "../../sbu_compiler-master/parser/table.npt";
//        if (args.length >= 6) {
//            for (int i = 0; i < args.length; i++) {
//                if (args[i].equals("--input")) {
//                    inputCoolFilePath = args[i + 1];
//                }
//                if (args[i].equals("--output")) {
//                    outputFilePath = args[i + 1];
//                }
//                if (args[i].equals("--table")) {
//                    tablePath = args[i + 1];
//                }
//            }
//        } else {
//            System.out.println("Run like bellow:\njava <javaClassFile> --input <inputCoolFilePath> --output <outputFilePath> --table <tablePath>");
//            return;
//        }
        // inputCoolFilePath can be like this: ./test/test1.cool
        // outputFilePath can be like this: ./out/test1.txt
        // tablePath can be like this: ./src/table.npt

        // Make a new instance of your parser that reads scanner tokens
        // and then call "parse" method of your parser

        // write the result of parsing in the outputFilePath.
        // if the syntax is correct you should write "Syntax is correct!"
        // and if the syntax is wrong, you should write "Syntax is wrong!" in outputFilePath.

        File file = new File(inputCoolFilePath);
        scanner.LexicalAnalyser scanner = new scanner.LexicalAnalyser(new FileReader(file));
//        CodeGeneratorImpl codeGenerator = new CodeGeneratorImpl();
//        Parser parser = new Parser(scanner, codeGenerator, tablePath);
//        parser.parse();

        scanner.Symbol symbol = scanner.next();
        while (symbol != null){
            System.out.println(symbol);
            symbol = scanner.next();
        }

    }
}