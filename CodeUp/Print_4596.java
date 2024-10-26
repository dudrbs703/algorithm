import java.util.Scanner;

/**
 * Print_4596
 */
public class Print_4596 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][]data = new int[9][9];

        int position = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                data[i][j] = scanner.nextInt();
                if(data[i][j] > position)
                {
                    position = data[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }
        scanner.close();

        System.out.println(position);
        System.out.println(a+" "+b);
    }
}