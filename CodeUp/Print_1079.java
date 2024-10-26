import java.util.Scanner;

/**
 * Print_1079
 */
public class Print_1079 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        
        while(true)
        {
            a = scanner.next();

            if(a.charAt(0) == 'q') {
                System.out.println(a.charAt(0));
                break;
            } else {
                System.out.println(a.charAt(0));
                continue;
            }
        }
        scanner.close();
    }
}