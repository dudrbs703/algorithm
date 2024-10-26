import java.util.Scanner;

/**
 * Print_1550
 */
public class Print_1550 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getSqrtNumber(scanner.nextDouble()));
        scanner.close();
    }

    public static int getSqrtNumber(double number)
    {
        return (int)Math.sqrt(number);
    }
}