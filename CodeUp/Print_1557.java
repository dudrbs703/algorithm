import java.util.Scanner;

/**
 * Print_1557
 */
public class Print_1557 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(getDivisorNumber(scanner.nextInt()));
        scanner.close();
    }

    public static int getDivisorNumber(int n)
    {
        int answer = 0;

        for(int i=1; i<=n; i++)
        {
            if(n % i == 0) answer++;
        }

        return answer;
    }
}