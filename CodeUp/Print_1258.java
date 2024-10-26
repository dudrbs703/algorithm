import java.util.Scanner;

/**
 * Print_1258
 */
public class Print_1258 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        int tmp = 0;
        for(int i=1; i<=a; i++)
        {
            tmp+=i;
        }

        System.out.println(tmp);
    }
}