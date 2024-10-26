import java.util.Scanner;

/**
 * Print_1547
 */
public class Print_1547 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(judgeNumber(scanner.nextInt()));
        scanner.close();
    }

    public static String judgeNumber(int number)
    {
        int count = 0;

        for(int i=1; i<number; i++)
        {
            if(number % i == 0) count++;
        }

        return count >= 2 ? "composite" : "prime";
    }
}