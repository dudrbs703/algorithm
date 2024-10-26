import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4026
 */
public class Print_4026 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<5; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        int count = 0;

        while(!queue.isEmpty())
        {
            if(count == 2) System.out.println(queue.poll());
            else queue.poll();

            count++;
           
        }
    }
}