import java.util.Scanner;

/**
 * Print_1159
 */
public class Print_1159 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if(a >= 50 && a <= 70 || a % 6 == 0) System.out.println("win");
        else System.out.println("lose");
        
    }
}