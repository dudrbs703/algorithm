import java.util.Scanner;

/**
 * Print_1559
 */
public class Print_1559 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        System.out.println(f(a,b));
    }

    public static long f(long a, long b)
    {
        return a + b;
    }
}