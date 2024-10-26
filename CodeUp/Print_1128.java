import java.util.Scanner;

/**
 * Print_1128
 */
public class Print_1128 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        System.out.println(String.format("%d",a*123456789L));
    }
}