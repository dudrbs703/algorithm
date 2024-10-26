import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1168
 */
public class Print_1168 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String birth = String.valueOf(scanner.next().subSequence(0, 2));
        int sex = scanner.nextInt();
        scanner.close();

        String a = "";
        switch(sex)
        {
            case 1:
            case 2:
                a+="19"+birth;
                break;

            case 3:
            case 4:
                a+="20"+birth;
                break;
        }
        
        System.out.println(2012 - Integer.parseInt(a)+1);
        
    }
}