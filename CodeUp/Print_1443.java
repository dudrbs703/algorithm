import java.util.Scanner;

/**
 * Print_1443
 */
public class Print_1443 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []data = new int[scanner.nextInt()];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        for(int i=1; i<data.length; i++)
        {
            for(int j=i; j > 0; j--)
            {
                if(data[j-1] > data[j])
                {
                    int tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                }
            }
        }

        for(int i=0; i<data.length; i++)
        {
            System.out.println(data[i]);
        }
    }
}