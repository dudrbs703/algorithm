import java.util.Scanner;

/**
 * Print_1149
 */
public class Print_1149 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(Math.max(a, b));
    }
}