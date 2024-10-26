import java.util.Scanner;

/**
 * Print_1354
 */
public class Print_1354 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=0; i<a; i++)
        {
            for(int j=i+1; j<=a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}