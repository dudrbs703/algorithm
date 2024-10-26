import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4566
 */
public class Print_4566 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        int result = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=a; i<=b; i++)
        {
            for(int j=2; j<=i; j++)
            {
                if(i%j == 0) count++;
            }
            if(count == 1) 
            {
                result += i;
                queue.offer(i);
            }
            count = 0;
        }

        if(result == 0) System.out.println(-1);
        else System.out.println(result);
        System.out.println(queue.poll());
    }
}