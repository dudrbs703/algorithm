import java.util.Scanner;

/**
 * Print_1733
 */
public class Print_1733 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        if(a.length() >= 4) System.out.println("I don't care.");
        else if(a.contains("IOI")) System.out.println("IOI is the International Olympiad in Informatics.");
        else System.out.println("I don't care.");
    }
}