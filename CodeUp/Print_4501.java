
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4501
 */
public class Print_4501 {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<7; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}