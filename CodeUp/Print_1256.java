import java.util.Scanner;

/**
 * Print_1256
 */
public class Print_1256 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=0; i<a; i++)
        {
            System.out.print("*");
        }
    }
}