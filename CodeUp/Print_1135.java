import java.util.Scanner;

/**
 * Print_1135
 */
public class Print_1135 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a >= b) System.out.println("1");
        else System.out.println("0");
    }
}