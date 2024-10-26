import java.util.Scanner;

/**
 * Print_4506
 */
public class Print_4506 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int min = a > b ? b : a;
        int gcd = 0;
        int gcd_a = 0;
        int gcd_b = 0;

        for(int i=1; i<=min; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
                gcd_a = a / i;
                gcd_b = b / i;
            }            
        }

        System.out.println(gcd);
        System.out.println(gcd * gcd_a * gcd_b);
    }
}