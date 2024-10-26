import java.util.Scanner;

/**
 * Print_2721
 */
public class Print_2721 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        int a_length = a.length();
        String b = scanner.next();
        int b_length = b.length();
        String c = scanner.next();
        int c_length = c.length();
        scanner.close();

        if(a.charAt(a_length-1) == b.charAt(0) && b.charAt(b_length-1) == c.charAt(0) && c.charAt(c_length-1) == a.charAt(0))
        {
            System.out.println("good");
        } else System.out.println("bad");
    }
}