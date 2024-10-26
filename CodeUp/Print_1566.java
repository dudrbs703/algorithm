import java.util.Scanner;

/**
 * Print_1566
 */
public class Print_1566 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pow(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static long pow(int a, int b)
    {
        long answer = 1;

        if( a == 1) answer = 1;
        else {
            for(int i=1; i<=b; i++)
            {
                answer *= a;
            }
        }

        return answer;
    }
}