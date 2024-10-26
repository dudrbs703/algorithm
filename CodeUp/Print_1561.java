import java.util.Scanner;

/**
 * Print_1561
 */
public class Print_1561 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(max(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}