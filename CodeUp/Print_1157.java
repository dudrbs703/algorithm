import java.util.Scanner;

/**
 * Print_1157
 */
public class Print_1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        scanner.close();

        if(a >= 50 && a <= 60) System.out.println("win");
        else System.out.println("lose");
        
    }
}