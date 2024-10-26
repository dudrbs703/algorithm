import java.util.Scanner;

/**
 * Print_1461
 */
public class Print_1461 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        int [][]array = new int[a][a];

        int count = 1;
        for(int i=0; i<array.length;i++)
        {
            for(int j=array[i].length-1; j>=0; j--)
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