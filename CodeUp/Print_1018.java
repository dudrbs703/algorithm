import java.util.Scanner;

/**
 * Print_1018
 */
public class Print_1018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        scanner.close();
        String[] tmp = s.split(":");
        
        System.out.println(tmp[0]+":"+tmp[1]);
    }
}