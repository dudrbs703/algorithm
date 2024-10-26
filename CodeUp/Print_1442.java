import java.util.Scanner;

/**
 * Print_1442
 */
public class Print_1442 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []data = new int[scanner.nextInt()];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        int min = 0;
        for(int i=0; i<data.length-1; i++)
        {
            min = i;
            for(int j=i+1; j<data.length; j++)
            {
                if(data[j] < data[min]) min = j;
            }

            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }

        for(int i=0; i<data.length; i++)
        {
            System.out.println(data[i]);
        }
    }
}