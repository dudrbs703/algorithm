import java.util.Scanner;

/**
 * Print_1535
 */
public class Print_1535 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []b = new int[a];
        for(int i=0; i<b.length; i++)
        {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int max = b[0];
        for(int i=0; i<b.length; i++)
        {
            if(b[i] > max) max = b[i];
        }

        for(int i=0; i<b.length; i++)
        {
            if(b[i] == max) System.out.println(i+1);
        }
    }
}