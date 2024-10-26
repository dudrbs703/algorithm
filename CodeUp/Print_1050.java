import java.util.Scanner;

/**
 * Print_1050
 */
public class Print_1050 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(a == b) System.out.println("1");
        else System.out.println("0");
    }
}