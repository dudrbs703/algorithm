import java.util.Scanner;

/**
 * Print_1155
 */
public class Print_1155 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if(a % 7 == 0) System.out.println("multiple");
        else System.out.println("not multiple");
    }
}