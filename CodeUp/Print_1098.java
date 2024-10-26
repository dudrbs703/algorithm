import java.util.Scanner;

/**
 * Print_1098
 */
public class Print_1098 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int line = scanner.nextInt();    

        int [][]data = new int[line][4];
        int [][]n = new int[x][y];

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                data[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        for(int i=0; i<data.length;i++)
        {
            int line_count = data[i][0];
            int direction = data[i][1];
            int x_position = data[i][2];
            int y_position = data[i][3];

            for(int j=0; j<line_count; j++)
            {
                if(direction == 0) n[x_position-1][y_position-1+j] = 1;
                if(direction == 1) n[x_position-1+j][y_position-1] = 1;
                
            }

            /*
            if(direction == 0)
            {
                for(int j=0; j<line_count; j++)
                {
                    n[x_position-1][y_position-1+j] = 1;
                }
            }

            if(direction == 1)
            {
                for(int j=0; j<line_count; j++)
                {
                    n[x_position-1+j][y_position-1] = 1;
                }
            }*/

        }

        for(int i=0; i<n.length; i++)
        {
            for(int j=0; j<n[i].length; j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}