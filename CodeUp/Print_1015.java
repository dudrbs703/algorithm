import java.util.Scanner;

/**
 * Print_1012
 */
public class Print_1015
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        System.out.printf(String.format("%.2f", a));
    }
}