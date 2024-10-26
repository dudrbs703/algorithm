import java.util.Scanner;

/**
 * Print_1407
 */
public class Print_1409 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []b = new int[10];

        for(int i=0; i<b.length; i++)
        {
            b[i] = scanner.nextInt();
        }

        System.out.println(b[scanner.nextInt()-1]);
        scanner.close();
    }
}