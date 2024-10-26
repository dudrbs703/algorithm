import java.util.Scanner;

/**
 * Print_3011
 */
public class Print_3011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data[] = new int[scanner.nextInt()];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        int count = 1;
        for(int i=0; i<data.length-1; i++)
        {
            for(int j=0; j<data.length-1; j++)
            {
                if(data[j] > data[j+1])
                {
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
            for(int k=0; k<data.length-1; k++)
            {
                if(data[k] > data[k+1])
                {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}