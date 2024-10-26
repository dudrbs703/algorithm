import java.util.Scanner;

/**
 * Print_4016
 */
public class Print_4016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int tmp = 0;

        int min = Math.min(Math.min(a, b), c);

        for(int i=1; i<=min; i++)
        {
            if(a%i == 0 && b%i == 0 && c%i == 0 ) tmp = i;
        }

        System.out.println(tmp);
    }
}