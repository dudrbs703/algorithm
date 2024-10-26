import java.util.Scanner;

/**
 * Print_1123
 */
public class Print_1123 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        scanner.close();
        System.out.println(String.format("%.3f", ((float)9/5)*a+32));
        
    }
}