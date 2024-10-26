import java.util.Scanner;

/**
 * Print_1467
 */
public class Print_1467 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int [][]array = new int[a][b];
        int count = 1;
        int level = b-1;

        while(level >= 0)
        {
            for(int i=0; i<array.length; i++)
            {
                array[i][level] = count++;
            }
            level--;
        }

        
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i].length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}