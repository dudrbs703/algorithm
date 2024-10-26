import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4701
 */
public class Print_4701 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int []data = new int[a];

        for(int i=0; i<a; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(data);
        
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println();

        for(int i=0; i<data.length-1; i++)
        {
            for(int j=i+1; j<data.length; j++)
            {
                int tmp = data[i] + data[j];
                System.out.print(tmp +" ");
            }
            System.out.println();
        }
    }
}