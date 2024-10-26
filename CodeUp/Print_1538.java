import java.util.Scanner;

/**
 * Print_1538
 */
public class Print_1538 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    public static String f(int n)
    {
        return n % 2 == 0 ? "even" : "odd";
    }
}