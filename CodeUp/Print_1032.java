import java.util.Scanner;

/**
 * Print_1032
 */
public class Print_1032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(Integer.toHexString(n));
        
    }
}
