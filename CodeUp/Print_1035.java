import java.util.Scanner;

/**
 * Print_1035
 */
public class Print_1035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        scanner.close();
        
        int n1 = Integer.parseInt(n, 16);
        System.out.println(Integer.toOctalString(n1));
        
    }
}