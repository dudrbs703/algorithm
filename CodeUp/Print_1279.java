import java.util.Scanner;

/**
 * Print_1279
 */
public class Print_1279 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;

        for(int i=a; i<=b; i++)
        {
            if(i%2 != 0) answer -= (i * -1);
            else answer += (i * -1);
            System.out.println(answer);
        }

        // 5 11 = 8
        System.out.println(answer);
    }
}