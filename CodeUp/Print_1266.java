import java.util.Scanner;

/**
 * Print_1266
 */
public class Print_1266 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int answer = 0;
        for(int i=0; i<a; i++)
        {
            answer+=scanner.nextInt();
        }

        scanner.close();

        System.out.println(answer);
    }
}