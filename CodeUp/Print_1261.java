import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1261
 */
public class Print_1261 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<10; i++)
        {
            queue.offer(scanner.nextInt());
        }
        scanner.close();

        int tmp =0;
        while(!queue.isEmpty())
        {
            int a = queue.poll();
            if(a % 5 == 0) 
            {
                tmp = a;
                break;
            }
        }

        if(tmp == 0) System.out.println(0);
        else System.out.println(tmp);
    }
}