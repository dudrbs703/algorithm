import java.util.Scanner;

/**
 * Print_1046
 */
public class Print_1046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(a+b+c);
        System.out.printf("%.1f", (a+b+c)/(float)3);
    }
}