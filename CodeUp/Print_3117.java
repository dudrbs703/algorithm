import java.util.Scanner;
import java.util.Stack;

/**
 * Print_3117
 */
public class Print_3117 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int a = scanner.nextInt();
        

        for(int i=0; i<a; i++)
        {
            int tmp = scanner.nextInt();
            
            if(tmp != 0) stack.add(tmp);
            else stack.pop();
        }
        scanner.close();

        int tmp = 0;

        while(!stack.isEmpty())
        {
            tmp += stack.pop();
        }

        System.out.println(tmp);
    }
}