import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4561
 */
public class Print_4561 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<7; i++)
        {
            int a = scanner.nextInt();
            if(a % 2 != 0)  queue.offer(a);
        }
        scanner.close();

        int min = queue.peek();
        int result = 0;
        
        while(!queue.isEmpty())
        {
            result += queue.poll();
        }

        System.out.println(result);
        System.out.println(min);


    }
}