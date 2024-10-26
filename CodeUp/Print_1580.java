import java.util.Scanner;

/**
 * Print_1580
 */
public class Print_1580 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.format("%.2f", getCircle(scanner.nextInt()));
        scanner.close();
    }

    public static double getCircle(int a)
    {
        return 3.14 * a * a;
    }
}