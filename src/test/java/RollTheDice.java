import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class RollTheDice {

    private static final String INFILENAME = "src\\main\\resources\\input\\submitInput.txt";
    private static String OUTFILENAME = "src\\main\\resources\\\\output\\outputChallenge1.txt";
    private static Scanner in;
    private static PrintWriter out;
    private static Object movement;


    public static void main(String[] args) throws FileNotFoundException {
        in = new Scanner(new FileReader(INFILENAME));
        out = new PrintWriter(OUTFILENAME);
        int i = 1;
        int cases = Integer.parseInt(in.nextLine());
        System.out.println("Number of cases: " + cases);
    }
}
