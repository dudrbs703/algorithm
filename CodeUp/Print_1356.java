import java.util.Scanner;

/**
 * Print_1356
 */
public class Print_1356 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=0; i<a; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        for(int i=0; i<a-2; i++)
        {
            System.out.print("*");
            for(int j=0;j<a-2; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for(int i=0; i<a; i++)
        {
            System.out.print("*");
        }
    }
}