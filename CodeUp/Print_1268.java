import java.util.Scanner;

/**
 * Print_1268
 */
public class Print_1268 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int answer = 0;
        for(int i=0; i<a; i++)
        {
            int tmp = scanner.nextInt();

            if(tmp % 2 == 0) answer++;
        }

        scanner.close();

        System.out.println(answer);
    }
}