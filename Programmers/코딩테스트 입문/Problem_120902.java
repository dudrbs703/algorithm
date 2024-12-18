import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem_120902
 */
public class Problem_120902 {

    public static void main(String[] args) {
        
        String my_string = "1 - 2 + 3 - 4";

        String []tmp = my_string.split(" ");
        
        Queue<String> queue = new LinkedList<>();

        for(String s : tmp)
        {
            queue.offer(s);
        }
        int answer = -100001;
        char op = ' ';

        while (!queue.isEmpty()) {

            if(answer == -100001) {
                answer = Integer.parseInt(queue.poll());
                continue;
            };

            String s = queue.poll();
            if(!Character.isDigit(s.charAt(0))) op = s.charAt(0);
            int i = Integer.parseInt(queue.poll());
            if(op == '+') {
                answer += i;
                continue;
            }
            if(op == '-') {
                answer -= i;    
                continue;
            }
            
        }
        


        
        System.out.println(answer);
    }
}