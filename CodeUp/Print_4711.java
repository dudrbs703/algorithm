import java.util.Scanner;

/**
 * Print_4711
 */
public class Print_4711 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]data = new int[4][2];

        int max = 0;
        int tmp = 0;
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                data[i][j] = scanner.nextInt();
                
                if(j == 1) 
                {
                    tmp -= data[i][0];
                    tmp += data[i][1];
                    max = Math.max(tmp, max);
                }
            }
        }
        scanner.close();

        System.out.println(max);
    }
}