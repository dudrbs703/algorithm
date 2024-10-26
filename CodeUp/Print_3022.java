import java.util.Scanner;
import java.util.Stack;

/**
 * Print_3022
 */
public class Print_3022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        
        scanner.close();
        
        if(a.length() < 10 && b.length() < 10)
        {
            System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
            System.exit(0);
        } 

        Stack<Character> a_stack = new Stack<>();
        Stack<Character> b_stack = new Stack<>();
        Stack<Character> tmp = new Stack<>();

        for(int i=0; i<a.length(); i++)
        {
            a_stack.push(a.charAt(i));
        }

        for(int i=0; i<b.length(); i++)
        {
            b_stack.push(b.charAt(i));
        }

        String answer = "";
        while(!tmp.isEmpty())
        {
            answer += tmp.pop();
        }

        System.out.println(answer);

    }
}