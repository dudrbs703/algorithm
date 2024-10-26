import java.util.Scanner;

/**
 * Print_1012
 */
public class Print_1012
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        scanner.close();

        System.out.printf(String.format("%.6f", input));
    }
}