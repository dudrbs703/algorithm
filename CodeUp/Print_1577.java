import java.util.Scanner;

/**
 * Print_1577
 */
public class Print_1577 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(myabs(scanner.nextInt()));
        scanner.close();
    }

    public static int myabs(int a)
    {
        return Math.abs(a);
    }
}