import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Print_1285
 */
public class Print_1285 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<a.length(); i++)
        {
            queue.offer(a.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        
        while(Character.isDigit(queue.peek()))
        {
            builder.append(Character.getNumericValue(queue.poll()));
        }

        int result = Integer.parseInt(builder.toString());
        while(!queue.isEmpty())
        {
            builder = new StringBuilder();
            char op = queue.poll();
            if(op == '=') break;

            while(Character.isDigit(queue.peek()))
            {
                builder.append(Character.getNumericValue(queue.poll()));
            }
            int tmp = Integer.parseInt(builder.toString());

            if(op == '+') result += tmp;
            else if(op == '-') result -= tmp;
            else if(op == '*') result *= tmp;
            else if(op == '/') result /= tmp;
        }

        System.out.println(result);
    }
}