import java.util.Scanner;

/**
 * Print_1501
 */
public class Print_1501 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        int [][]b = new int[a][a];
        int c = 1;

        for(int i =0; i<b.length; i++)
        {
            for(int j =0; j<b.length; j++)
            {
                b[i][j] = c++;
            }
        }

        for(int i =0; i<b.length; i++)
        {
            for(int j =0; j<b.length; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }



    }
}