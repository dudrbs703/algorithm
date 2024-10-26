import java.util.Scanner;

/**
 * Print_1564
 */
public class Print_1564 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(gcd(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static int gcd(int a, int b)
    {
        int tmp = a < b ? a : b;

        int answer = 0;
        for(int i=1; i<=tmp ; i++)
        {
            if(a % i == 0 && b % i == 0) answer = i;
        }

        return answer;
    }
}