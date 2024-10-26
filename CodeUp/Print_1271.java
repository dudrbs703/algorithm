import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1271
 */
public class Print_1271 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<a; i++)
        {
            queue.offer(scanner.nextInt());
        }

        scanner.close();
        System.out.println(queue.poll());
    }
}