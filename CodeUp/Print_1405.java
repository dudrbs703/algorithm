import java.util.Scanner;

/**
 * Print_1403
 */
public class Print_1405 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int array[] = new int[a];
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        int length = array.length;

        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length; j++)
            {
                System.out.print(array[j]+" ");
            }

            int k = array[0];
            for(int l = 0; l<array.length-1; l++)
            {
                array[l] = array[l+1];
            }
            array[length-1] = k;
            
            System.out.println();
        }
    }
}