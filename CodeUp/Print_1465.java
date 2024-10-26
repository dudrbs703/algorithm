import java.util.Scanner;

/**
 * Print_1464
 */
public class Print_1465 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int [][]array = new int[a][b];

        int count = 1;

        for(int i=array.length-1; i>=0; i--)
        {
            for(int j=0; j<array[i].length; j++)
            {
                array[i][j] = count++;
            }
        }

        for(int i=0; i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}