import java.util.Scanner;

/**
 * Print_1257
 */
public class Print_1257 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for(int i=a; i<=b; i++)
        {
            if(i%2 != 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}