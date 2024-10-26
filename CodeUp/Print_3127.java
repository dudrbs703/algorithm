import java.util.Scanner;
import java.util.Stack;

/**
 * Print_3127
 */
public class Print_3127 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        String data = scanner.nextLine();
        scanner.close();
        StringBuilder builder = new StringBuilder();

        /*
        for(int i=0; i<data.length(); i++)
        {
            if(data.charAt(i) == ' ') continue;
            else builder.append(data.charAt(i));
        }
        data = builder.toString();*/    
        
        for(int i=0; i<data.length();i++)
        {
            if(data.charAt(i) == ' ' )
            {
                stack.push(builder.toString());
                builder.delete(0, builder.length());
                continue;
            } else {
                builder.append(data.charAt(i));
                continue;
            }
            
            if(!Character.isDigit(data.charAt(i))) //stack.push(String.valueOf(data.charAt(i)));
            {
                char op = data.charAt(i);
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                switch(op)
                {
                    case '+':
                        stack.push(String.valueOf(a + b));
                        break;

                    case '-':
                        stack.push(String.valueOf(a - b));
                        break;

                    case '*':
                        stack.push(String.valueOf(a * b));
                        break;

                    case '/':
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }
        
        System.out.println(stack.pop());
    }
}