import java.util.Scanner;

/**
 * Print_1051
 */
public class Print_1051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(b >= a) System.out.println("1");
        else System.out.println("0");
    }
}