import java.util.Scanner;

/**
 * Print_1059
 */
public class Print_1059 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        scanner.close();

        System.out.println(~a);
    }
}