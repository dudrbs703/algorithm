import java.util.Scanner;

/**
 * Print_1064
 */
public class Print_1064 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        System.out.println((a < b ? a : b) < c ? ( a < b ? a : b ) : c);
    }
}