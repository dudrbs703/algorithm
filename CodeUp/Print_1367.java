import java.util.Scanner;

/**
 * Print_1367
 */
public class Print_1367 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=a; i>0; i--)
        {
            for(int j=i-1; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<a; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}