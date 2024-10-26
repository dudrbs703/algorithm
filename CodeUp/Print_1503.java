import java.util.Scanner;

/**
 * Print_1503
 */
public class Print_1503 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        int [][]b = new int[a][a];
        int c = 1;
        boolean isReversed = false;
        
        for(int i =0; i<b.length; i++)
        {
            if(isReversed)
            {
                for(int j = b.length-1 ; j>= 0; j--)
                {
                    b[i][j] = c++;
                }
                isReversed = false;
            } else {
                for(int j =0; j<b.length; j++)
                {
                    b[i][j] = c++;
                }
                isReversed = true;
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