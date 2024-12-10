import java.util.Scanner;

/**
 * Print_1276
 */
public class Print_1276 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        int count = 1;
        for(int i=a; i>=1; i--)
        {
            count *= i;
        }

        System.out.println(count);
    }
}