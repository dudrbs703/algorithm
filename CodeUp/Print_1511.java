import java.util.Scanner;

/**
 * Print_1511
 */
public class Print_1511 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][]data = new int[n][n];
        scanner.close();
        int count = 1;

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data.length; j++)
            {
                data[i][j] = count++;
            }
        }

        int result = 0;
        for(int i=0; i<data.length; i++)
        {
           result+=data[0][i];
           result+=data[data.length-1][i];
        }
        
        for(int i=1; i<n-1; i++)
        {
            result+=data[i][0];
            result+=data[i][data.length-1];
        }

        System.out.println(result);
    }
}