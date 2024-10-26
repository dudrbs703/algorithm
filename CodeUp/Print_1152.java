import java.util.Scanner;

/**
 * Print_1152
 */
public class Print_1152 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if(a < 10) System.out.println("small");
        else System.out.println("big");    
    }
}