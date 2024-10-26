import java.util.Scanner;
import java.util.Stack;

/**
 * Print_3021
 */
public class Print_3021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        
        scanner.close();
        
        if(a.length() < 10 && b.length() < 10)
        {
            System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
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

        int count = 0;

        while(true)
        {
            //count = 0;
            if(a_stack.isEmpty() || b_stack.isEmpty())
            {
                while(!a_stack.isEmpty())
                {
                    if(count >= 1) 
                    {
                        int inner = Character.getNumericValue(a_stack.pop());
                        inner += count;
                        if(inner >= 10) 
                        {
                            count = Character.getNumericValue(String.valueOf(inner).charAt(0));
                            tmp.push(String.valueOf(inner).charAt(1));
                        }
                    } else tmp.push(a_stack.pop());
                }
    
                while(!b_stack.isEmpty())
                {
                    if(count >= 1) 
                    {
                        int inner = Character.getNumericValue(b_stack.pop());
                        inner += count;
                        if(inner >= 10) 
                        {
                            count = Character.getNumericValue(String.valueOf(inner).charAt(0));
                            tmp.push(String.valueOf(inner).charAt(1));
                        }
                    } else tmp.push(b_stack.pop());
                }

                if(count >= 1) tmp.push((char)(count+48));
                break;
            } else {
                int a_tmp = Character.getNumericValue(a_stack.pop());
                int b_tmp = Character.getNumericValue(b_stack.pop());
                String c_tmp = String.valueOf(a_tmp + b_tmp + count);

                if(c_tmp.length() >= 2)
                {
                    count = Character.getNumericValue(c_tmp.charAt(0));
                    tmp.push(c_tmp.charAt(1));
                } else {
                    tmp.push(c_tmp.charAt(0));
                    count = 0;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        while(!tmp.isEmpty())
        {
            builder.append(tmp.pop());
        }

        System.out.println(builder.toString());
    }
}