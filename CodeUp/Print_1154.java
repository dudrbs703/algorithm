import java.util.Scanner;

/**
 * Print_1154
 */
public class Print_1154 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(a >= b) System.out.println(a-b);
        else if(a <= b) System.out.println(b-a);
    }
}