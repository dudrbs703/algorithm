import java.util.Scanner;

/**
 * Print_1166
 */
public class Print_1166 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if(a % 100 != 0 && a % 4 == 0 || a % 400 == 0) System.out.println("yes");
        else System.out.println("no");
    }
}