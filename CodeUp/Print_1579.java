import java.util.Scanner;

/**
 * Print_1579
 */
public class Print_1579 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(mymin(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    public static int mymin(int a, int b)
    {
        return Math.min(a, b);
    }
}