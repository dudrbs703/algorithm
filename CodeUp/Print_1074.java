import java.util.Scanner;

/**
 * Print_1074
 */
public class Print_1074 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();

        while(a != 0)
        {
            System.out.println(a);
            a--;
            
        }
        
        scanner.close();
    }
}