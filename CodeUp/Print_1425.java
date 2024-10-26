import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1425
 */


public class Print_1425
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<a; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        int count = 0;

        while(!queue.isEmpty())
        {
            count++;
            System.out.print(queue.poll()+" ");
            if(count % b == 0)
            {
                System.out.println();
            }
        }
    }
}