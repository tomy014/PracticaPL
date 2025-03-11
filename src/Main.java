import java.io.*;
import org.antlr.v4.runtime.*;


public class Main {
    public static void main(String[] args) {
        /*Transformar el archivo que recibe como parámetro (un fichero .pas) por un fichero resultante .c
         *
         */
        try {
            // Fichero de entrada
            CharStream input = CharStreams.fromFileName(args[0]);
            // Analizador léxico
            TraductorPascalLexer analex = new TraductorPascalLexer(input);
            // Declaramos los tokens
            CommonTokenStream tokens = new CommonTokenStream(analex);
            // Analizador sintáctico
            TraductorPascalParser anasint = new TraductorPascalParser(tokens);


            StringBuilder output = new StringBuilder();
            // Redirigir la salida a un fichero en .c
            String name = args[0] + ".c";
            FileOutputStream file = new FileOutputStream(name);
            System.setOut(new PrintStream(file));

            //Llamar al programa del analizador sintáctico
            anasint.prg();
        }
        catch (org.antlr.v4.runtime.RecognitionException e){//Error de reconocimiento en la entrada
            System.err.println("Error (ANTLr): " + e.getMessage());
        }
        catch (IOException e){//Error de entrada/salida
            System.err.println("Error (IO): " + e.getMessage());
        }
        catch (Exception e){ //Error genérico
            System.err.println("Error (Test): " + e);
        }
    }
}