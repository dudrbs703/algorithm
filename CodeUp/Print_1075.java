import java.util.Scanner;

/**
 * Print_1075
 */
public class Print_1075 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();

        while(a != 0)
        {
            --a;
            System.out.println(a); 
        }
        
        scanner.close();
    }
}