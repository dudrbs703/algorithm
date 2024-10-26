import java.util.Scanner;

/**
 * Print_1158
 */
public class Print_1158 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        scanner.close();

        if(a >= 30 && a <= 40 || a >= 60 && a <= 70) System.out.println("win");
        else System.out.println("lose");
        
    }
}