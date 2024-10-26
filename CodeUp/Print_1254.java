import java.util.Scanner;

/**
 * Print_1254
 */
public class Print_1254 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        char a_tmp = a.charAt(0);
        char b_tmp = b.charAt(0);

        for(int i=a_tmp; i<=b_tmp; i++)
        {
            System.out.print((char)i +" ");
        }
    }
}