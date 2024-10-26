import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Print_1675
 */

public class Print_1294 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[]c = scanner.nextLine().toCharArray();
        scanner.close();
    
        StringBuilder builder = new StringBuilder();
        for(char ch : c)
        {
            if(ch == ' ') {
                builder.append(ch);
                continue;
            }

            if(ch == 'x') ch = 'a';
            else if(ch == 'y') ch = 'b';
            else if(ch == 'z') ch = 'c';
            else ch+=3; 

            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}