import java.util.Scanner;

/**
 * Print_1556
 */
public class Print_1556 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(factorial(scanner.nextInt()));
        scanner.close();
    }

    public static int factorial(int n)
    {
        int answer = 1;

        for(int i=1; i<=n; i++)
        {
            answer *= i;
        }

        return answer;
    }
}