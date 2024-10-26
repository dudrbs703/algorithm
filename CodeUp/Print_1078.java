import java.util.Scanner;

/**
 * Print_1077
 */
public class Print_1078 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        int b = 0;
        for(int i=1; i<=a; i++)
        {
            if(i%2 == 0) b+=i;
        }

        System.out.println(b);
    }
}