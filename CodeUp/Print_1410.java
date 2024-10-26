import java.util.Scanner;

/**
 * Print_1410
 */
public class Print_1410 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        int open = 0;
        int close = 0;

        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == '(') open++;
            if(a.charAt(i) == ')') close++;
        }

        System.out.println(open +" "+ close);
        scanner.close();
    }
}