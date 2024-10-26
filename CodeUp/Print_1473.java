import java.util.Scanner;

/**
 * Print_1473
 */
public class Print_1473 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int [][]data = new int[a][b];
        
        int level = data.length-1;
        int count = 1;

        boolean isReversed = false;
        
        while(level >= 0)
        {
            if(!isReversed)
            {
                for(int i=0; i<data[level].length; i++)
                {
                    data[level][i] = count++;
                }

                isReversed = true;
            } else {

                for(int i=data[level].length-1; i>=0; i--)
                {
                    data[level][i] = count++;
                }
            
                isReversed = false;
               
            }
            level--;
        }

        for(int i=0;i<data.length;i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}