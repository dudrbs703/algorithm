import java.util.Scanner;

/**
 * Print_1357
 */
public class Print_1357 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for(int i=n-1; i>=0; i--)
        {
            for(int j=i-1; j>=0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }       
    }
}