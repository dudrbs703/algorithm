import java.util.Scanner;

/**
 * Print_1282
 */
public class Print_1282 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        int b = 0;
        for(int i=1; i<=a; i++)
        {
            if((i*i) < a) b = i;
            else break;
        }

        int n = b;
        b = a - (b*b);
        System.out.print(b + " " + n);

    }
}