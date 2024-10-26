import java.util.Scanner;

/**
 * Print_1508
 */
public class Print_1508 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]data = new int[n][n];

        for(int i=0; i<n; i++)
        {
            data[i][0] = scanner.nextInt();
        }
        scanner.close();

        for(int i=1; i<data.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                data[i][j+1] = data[i][j] - data[i-1][j];
            }
        }
        
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(data[i][j]+" " );
            }

            System.out.println();
        }
    }
}