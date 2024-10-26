import java.util.Scanner;

/**
 * Print_1470
 */
public class Print_1470 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        int [][]data = new int[a][a];
        
        int level = 0;
        int count = 1;

        boolean isReversed = false;
        
        while(level < a)
        {
            if(!isReversed)
            {
                for(int i=0; i<data.length; i++)
                {
                    data[i][level] = count++;
                }

                isReversed = true;
            } else {
                for(int i=data.length-1; i>=0; i--)
                {
                    data[i][level] = count++;
                }
                

                isReversed = false;
            }
            level++;
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