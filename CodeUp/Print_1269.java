import java.util.Scanner;

/**
 * Print_1269
 */
public class Print_1269 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int multiply = scanner.nextInt();
        int plus = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int tmp = 0;
        for(int i=1; i<n; i++)
        {
            tmp = start * multiply + plus;
            start = tmp;
        }

        if(start <= 0) System.out.println(start);
        else System.out.println(tmp);

    }
}