import java.util.Scanner;

/**
 * Print_1028
 */
public class Print_1028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseUnsignedInt(scanner.next());
        scanner.close();

        System.out.println(Integer.toUnsignedString(a));

    }
}