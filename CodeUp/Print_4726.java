import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4726
 */
public class Print_4726 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int []data = new int[a];
        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<=data.length-b; i++)
        {
            for(int j=i; j<i+b; j++)
            {
                result += data[j]; 
                //System.out.println(result);
            }
            queue.offer(result);
            result = 0;
        }

        System.out.println(queue.poll());
    }
}