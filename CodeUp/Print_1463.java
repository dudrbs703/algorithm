import java.util.Scanner;

/**
 * Print_1463
 */
public class Print_1463 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        int [][]array = new int[a][a];

        int count = 1;
        int level = 0;

        while(level < a)
        {
            for(int i=array.length-1; i>=0;i--)
            {
                array[i][level] = count++;
            }
            level++;
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