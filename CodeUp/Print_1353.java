import java.util.Scanner;

/**
 * Print_1353
 */
public class Print_1353 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}