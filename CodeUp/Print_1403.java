import java.util.Scanner;

/**
 * Print_1403
 */
public class Print_1403 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int array[] = new int[a];
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<array.length; j++)
            {
                System.out.println(array[j]);
            }
        }
    }
}