import java.util.Scanner;

/**
 * Print_1224
 */
public class Print_1224 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        scanner.close();

        if((a / b) > (c / d)) System.out.println(">");
        else if((a / b) == (c / d)) System.out.println("=");
        else System.out.println("<");

    }

    // 1 2 3 4 <
    // 2 1 3 4 >
}