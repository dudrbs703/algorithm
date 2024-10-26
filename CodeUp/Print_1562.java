import java.util.Scanner;

/**
 * Print_1561
 */
public class Print_1562 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(min(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}