import java.util.Scanner;

/**
 * Print_1144
 */
public class Print_1144 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(a|b);
    }
}