import java.util.Scanner;

/**
 * Print_1138
 */
public class Print_1138 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        scanner.close();

        if(a == 0) System.out.println("1");
        else System.out.println("0");
    }
}