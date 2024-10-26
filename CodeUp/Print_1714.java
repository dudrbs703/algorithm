import java.util.Scanner;
import java.util.Stack;

/**
 * Print_1714
 */
public class Print_1714 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<a.length(); i++)
        {
            stack.push(a.charAt(i));
        }

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}