import java.util.Scanner;

/**
 * Print_1287
 */
public class Print_1287 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=9; i++)
        {
            for(int j=1; j<=(i*a); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}