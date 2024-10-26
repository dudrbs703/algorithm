import java.util.Scanner;

/**
 * Print_1117
 */
public class Print_1117 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        scanner.close();

        System.out.println(String.format("%.2f", a*b));
    }
}