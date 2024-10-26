import java.util.Scanner;

/**
 * Print_1578
 */
public class Print_1578 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(mymax(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    public static int mymax(int a, int b)
    {
        return Math.max(a, b);
    }
}