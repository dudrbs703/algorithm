import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1172
 */
public class Print_1172 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<3; i++)
        {
            queue.offer(scanner.nextInt());
        }

        while(!queue.isEmpty())
        {
            System.out.print(queue.poll()+" ");import java.util.PriorityQueue;
            import java.util.Scanner;
            
            /**
             * Print_1172
             */
            public class Print_1172 {
            
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    PriorityQueue<Integer> queue = new PriorityQueue<>();
                    for(int i=0; i<3; i++)
                    {
                        queue.offer(scanner.nextInt());
                    }
            
                    while(!queue.isEmpty())
                    {
                        System.out.print(queue.poll()+" ");
                    }
                }
            }
        }
    }
}