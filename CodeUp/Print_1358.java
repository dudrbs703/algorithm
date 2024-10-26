import java.util.Scanner;

/**
 * Print_1358
 */
public class Print_1358 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        
        for(int i=0; i<a/2+1; i++)
        {
            for(int j=0; j<a/2-i; j++)
            {
                System.out.print(" "); 
            }

            for(int j=0; j<i*2+1; j++)
            {
                System.out.print("*");
            }
            
           System.out.println();
        }
        
    }
}