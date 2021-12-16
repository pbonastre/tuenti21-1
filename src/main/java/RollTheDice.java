import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class RollTheDice {

    private static final String INFILENAME = "src\\main\\resources\\input\\submitInput.txt";
    private static final String OUTFILENAME = "src\\main\\resources\\\\output\\outputChallenge1.txt";
    private static Scanner in;
    private static PrintWriter out;
    private static Object movement;


    public static void main(String[] args) throws FileNotFoundException {
        out = new PrintWriter(OUTFILENAME);
        try (Stream<String> stream = Files.lines(Paths.get(INFILENAME))) {
            AtomicInteger index = new AtomicInteger(1);
            stream.skip(1)
                    .map(linea -> linea.split(":"))
                    .map(l -> sumDices(l))
                    .map(number -> "Case #" + index.getAndIncrement() + ": " + (number == 12 ? "-" : number + 1))
                    .forEach(value -> out.println(value));

            out.close();
            //.forEach(System.out::println)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumDices(String[] dices) {
        return (Integer.parseInt(dices[0]) + Integer.parseInt(dices[1]));
    }
}
