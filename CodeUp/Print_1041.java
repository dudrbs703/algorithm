import java.util.Scanner;

/**
 * Print_1041
 */
public class Print_1041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);
        scanner.close();

        System.out.println((char)(c+1));
    }
}