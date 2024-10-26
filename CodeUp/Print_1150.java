import java.util.Scanner;

/**
 * Print_1150
 */
public class Print_1150 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();    

        int d = Math.min(a, b);

        System.out.println(Math.min(c, d));
    }
}