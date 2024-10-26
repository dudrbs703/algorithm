import java.util.Scanner;

/**
 * Print_1031
 */
public class Print_1031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(Integer.toOctalString(n));
    }
}