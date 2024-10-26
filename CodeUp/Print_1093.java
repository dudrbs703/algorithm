import java.util.Scanner;

/**
 * Print_1093
 */
public class Print_1093 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int position = 0;

        int []b = new int[24];

        for(int i=1; i<=a; i++)
        {
            position = scanner.nextInt();
            b[position]++;
        }
        scanner.close();

        for(int i=1; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}