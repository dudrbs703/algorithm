import java.math.BigInteger;
import java.util.Scanner;

/**
 * Print_1565
 */
public class Print_1565 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(lcm(scanner.nextLong(), scanner.nextLong()));
        //System.out.println(gcd(scanner.nextLong(), scanner.nextLong()));
        scanner.close();
    }

    private static long lcm(long a, long b)
    {
        return (a*b) / gcd(a, b);
    }

    private static long gcd(long a, long b)
    {
        //long tmp = a < b ? a : b;
        //long answer = 0;
        long c = 0;
        /*
        for(int i=1; i<=tmp ; i++)
        {
            if(a % i == 0 && b % i == 0) answer = i;
        }*/

        //Euclidean
        while(true)
        {
            c = a % b;
            if( c == 0) break;
            else {
                a = b;
                b = c;
            }
        }

        return b;
    }
}