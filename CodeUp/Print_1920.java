import java.util.Scanner;

/**
 * Print_1920
 */
public class Print_1920 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        binary(scanner.nextInt());
        scanner.close();
    }

    public static void binary(int a)
    {
        if(a > 1) binary(a / 2);
        System.out.print(a % 2);
    }
}