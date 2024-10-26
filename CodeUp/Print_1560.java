import java.util.Scanner;

/**
 * Print_1560
 */
public class Print_1560 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        if(a > b) System.out.println(a-b);
        else System.out.println(b-a);
    }
}