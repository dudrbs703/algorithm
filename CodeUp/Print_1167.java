import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1167
 */
public class Print_1167 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = 0;
        for(int i = 0; i<3; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        while(!queue.isEmpty())
        {
            if(n == 1) {
                System.out.println(queue.poll());
                break;
            }
            queue.poll();
            n++;
        }
        
    }
}