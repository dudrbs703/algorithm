import java.util.Scanner;

/**
 * Print_1278
 */
public class Print_1278 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();
        int count = a.toCharArray().length;

        System.out.println(count);
    }
}