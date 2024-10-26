import java.util.Scanner;

/**
 * Print_1073
 */
public class Print_1073 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = 1;

        while(a != 0)
        {
            a = scanner.nextInt();
            if( a == 0) break;
            else System.out.println(a);
        }
        
        scanner.close();
    }
}