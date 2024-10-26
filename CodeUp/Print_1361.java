import java.util.Scanner;

/**
 * Print_1361
 */
public class Print_1361 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}