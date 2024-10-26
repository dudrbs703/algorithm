import java.util.Scanner;

/**
 * Print_1555
 */
public class Print_1555 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getTotalToN(scanner.nextLong()));
        scanner.close();
    }

    public static long getTotalToN(long n)
    {
        long answer = 0;

        for(long i=1; i<=n; i++)
        {
            answer+=i;
        }
        
        return answer;
    }
}