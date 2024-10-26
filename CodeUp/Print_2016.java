import java.util.Scanner;
import java.util.Stack;

/**
 * Print_2016
 */
public class Print_2016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        
        String b = scanner.next();
        scanner.close();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<a; i++)
        {
            stack.push(b.charAt(i));
        }
        
        int count = 0;
        String answer = "";
        while(!stack.isEmpty())
        {
            answer+=stack.pop();
            count++;

            
            if(count >= 3) 
            {
                answer+=","; 
                count=0; 
            }
        }

        Stack<Character> tmp = new Stack<>();
        for(int i=0; i<answer.length();i++)
        {
            tmp.push(answer.charAt(i));
        }

        answer = "";
        while (!tmp.isEmpty()) {
            answer+=tmp.pop();
        }

        //if(answer.startsWith(",")) answer.replace(",", "");
        if(answer.charAt(0) == ',')
        {
            tmp.clear();
            for(int i=answer.length()-1; i >= 1; i--)
            {
                tmp.push(answer.charAt(i));
            }

            answer = "";

            while(!tmp.isEmpty())
            {
                answer+=tmp.pop();
            }
        }
        System.out.println(answer);
    }
}