import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Print_1675
 */

public class Print_1675 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //int NUMBER_OF_ALPHABAT = 26;

        char[]c = scanner.nextLine().toCharArray();
        scanner.close();
    
        StringBuilder builder = new StringBuilder();
        for(char ch : c)
        {
            if(ch == ' ') {
                builder.append(ch);
                continue;
            }

            if(ch == 'a') ch = 'x';
            else if(ch == 'b') ch = 'y';
            else if(ch == 'c') ch = 'z';
            else ch-=3; 
            //(char)((ch - 'a' - 3) % NUMBER_OF_ALPHABAT +'a');

            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}