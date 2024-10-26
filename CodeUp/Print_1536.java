import java.util.Scanner;

/**
 * Print_1536
 */
public class Print_1536 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []b = new int[a];
        for(int i=0; i<b.length; i++)
        {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int min = b[0];
        for(int i=0; i<b.length; i++)
        {
            if(b[i] < min) min = b[i];
        }

        System.out.println(min);
    }
}