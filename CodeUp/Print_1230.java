import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Print_1230
 */
public class Print_1230 {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<3; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        while(!queue.isEmpty())
        {
            if(queue.peek() > 170) queue.poll();
            else {
                System.out.println("CRASH "+queue.peek());
                System.exit(0);
            }
        }

        System.out.println("PASS");
    }
}