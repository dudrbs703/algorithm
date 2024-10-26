import java.util.Scanner;

/**
 * Print_1539
 */
public class Print_1539 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    public static String f(int n)
    {
        return n == 0 ? "false" : "true";
    }
}