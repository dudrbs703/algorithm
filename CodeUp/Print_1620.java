import java.util.Scanner;

/**
 * Print_1620
 */
public class Print_1620 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();
        
        int tmp = 0;
        while (a.length() != 1) {
            for(int i=0; i<a.length(); i++)
            {
                tmp += Character.getNumericValue(a.charAt(i));
            }
            a = String.valueOf(tmp);
            tmp = 0;
        }

        System.out.println(a);
    }
}