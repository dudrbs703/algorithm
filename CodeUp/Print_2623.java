import java.util.Scanner;

/**
 * Print_2623
 */
public class Print_2623 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int tmp = 1;
        for(int i=1; i<=Math.min(a, b); i++)
        {
            if(a%i == 0 && b % i == 0) tmp = i;
        }
        System.out.println(tmp);
        
    }
}