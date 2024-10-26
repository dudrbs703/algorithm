import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;

/**
 * Print_4621
 */
public class Print_4621 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int i=1; i<=a; i++)
        {
            if(a % i == 0)
            {
                list.offer(i);
            }
        }

        if(list.size() < b) {
            System.out.println(0);
            System.exit(0);
        }
        
        int count = 1;
        while(!list.isEmpty())
        {
            if(count == b) {
                System.out.println(list.poll());
                break;
            } 

            list.poll();
            count++;
        }
    }
}