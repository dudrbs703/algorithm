import java.util.Scanner;

/**
 * Print_4036
 */
public class Print_4036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int a = (n + m) / 2;
        int b = a - m;
        
        System.out.println(a);
        System.out.println(b);
    }
}