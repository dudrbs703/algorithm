import java.util.Scanner;

/**
 * Print_1096
 */
public class Print_1096 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int [][]b = new int[20][20];

        int x = 0;
        int y = 0;

        for(int i=0; i<a; i++)
        {
            x = scanner.nextInt();
            y = scanner.nextInt();
            b[x][y] = 1;
        }
        
        for(int i=1; i<b.length; i++)
        {
            for(int j=1; j<b.length; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}