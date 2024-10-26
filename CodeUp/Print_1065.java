import java.util.Scanner;

/**
 * Print_1065
 */
public class Print_1065 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        if(a % 2 == 0) System.out.println(a);
        if(b % 2 == 0) System.out.println(b);
        if(c % 2 == 0) System.out.println(c);
    }
}