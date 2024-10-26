import java.util.Scanner;

/**
 * Print_1267
 */
public class Print_1267 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int answer = 0;
        for(int i=0; i<a; i++)
        {
            int tmp = scanner.nextInt();

            if(tmp % 5 == 0) answer+=tmp;
        }

        scanner.close();

        System.out.println(answer);
    }
}