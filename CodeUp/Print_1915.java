import java.util.Scanner;

/**
 * Print_1915
 */
public class Print_1915 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getFibon(scanner.nextInt()));
        scanner.close();
    }

    public static int getFibon(int a)
    {
        if(a <= 2) return 1;
        return (getFibon(a-1) + getFibon(a-2)) % 10009;
    }
}