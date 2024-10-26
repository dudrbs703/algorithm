import java.util.Scanner;

/**
 * Print_1542
 */
public class Print_1542 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    public static String f(int n)
    {
        int count = 0;

        for(int i=1; i<=n; i++)
        {
            if(n%i == 0) count++;
        }

        if(count <= 2) return "prime";
        else return "composite";
    }
}