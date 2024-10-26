import java.util.Scanner;
import java.util.Stack;

/**
 * Print_4041
 */
public class Print_4041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();
        
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<a.length(); i++)
        {
            stack.add(a.charAt(i));
        }

        int tmp = 0;
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty())
        {
            char c = stack.pop();
            builder.append(c);
            tmp+=Character.getNumericValue(c);

        }

        System.out.println(Integer.parseInt(builder.toString()));
        System.out.println(tmp);
    }
}