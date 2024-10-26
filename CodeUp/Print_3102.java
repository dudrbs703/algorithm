import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * Print_3102
 */
public class Print_3102 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
       
        try{
            int a = (int)reader.read()+'0';
            System.out.println(a);
            for(int i=0; i<a; i++)
            {
               
                String b = reader.readLine();

                if(b.startsWith("push"))
                {
                    b = b.replaceAll(" ", "").replace("push(", "").replace(")", "");
                    stack.push(b);
                }
                if(b.startsWith("top")){
                    writer.write(stack.peek());
                    writer.newLine();
                }
                if(b.startsWith("pop")){
                    stack.pop();
                }
                if(b.startsWith("size")){
                    writer.write(stack.size());
                    writer.newLine();
                }
                if(b.startsWith("empty")){
                    writer.write(String.valueOf(stack.isEmpty()));
                    writer.newLine();
                }
            
            }
            writer.flush();
            writer.close();
           
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}