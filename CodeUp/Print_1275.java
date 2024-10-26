import java.util.Scanner;

/**
 * Print_1275
 */
public class Print_1275 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println((int)Math.pow(a, b));
    }
}