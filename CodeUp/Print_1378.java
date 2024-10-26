import java.util.Scanner;

/**
 * Print_1378
 */
public class Print_1378 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        int tmp = 0;
        for(int i=0; i<=a; i++)
        {
            for(int j=1; j<=i; j++)
            {
                tmp+=j;
            }
        }

        System.out.println(tmp);
    }
}