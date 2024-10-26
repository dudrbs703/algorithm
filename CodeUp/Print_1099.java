import java.util.Scanner;

/**
 * Print_1099
 */
public class Print_1099 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][]data = new int[10][10];

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                data[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int x_position = 1;
        int y_position = 1;

        while(true)
        {
            if(x_position >= data.length || y_position >= data.length) break;
            if(data[x_position][y_position] == 2)
            {
                data[x_position][y_position] = 9;
                break;
            }

            if(data[x_position][y_position] == 0) data[x_position][y_position] = 9;
            if(data[x_position][y_position+1] == 1) x_position++;
            else y_position++;
        }

        System.out.println();
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