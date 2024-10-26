import java.util.Scanner;

/**
 * Print_1402
 */
public class Print_1402 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int array[] = new int[a];
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i=array.length-1; i>=0; i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}