import java.util.Scanner;

/**
 * Print_1156
 */
public class Print_1156 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if(a % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}