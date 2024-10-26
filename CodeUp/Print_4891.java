import java.util.Arrays;
import java.util.Scanner;

/**
 * Print_4891
 */
public class Print_4891 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []data = new int[a];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(data);
        int min = data[0];
        int max = data[a-1];
        int count = 0;
        
        for(int i=min; i<max; i++)
        {
            count++;
        }
        System.out.println(count);
    }
}