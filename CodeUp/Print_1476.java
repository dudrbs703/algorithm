import java.util.Scanner;

/**
 * Print_1476
 */
public class Print_1476 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int [][]data = new int[a][b];
        int count = 1;
        int level = 0;
        
        while(level < a + b)
        {
            for(int i=0; i<b; i++)
            {
                for(int j=0; j<a; j++)
                {
                    if(i+j == level) data[j][i] = count++;
                }
            } 
            level++;
        }

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}