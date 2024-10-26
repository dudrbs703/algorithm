import java.util.Scanner;

/**
 * Print_4013
 */
public class Print_4013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        System.out.println(2+" "+Integer.toBinaryString(a));
        System.out.println(8+" "+Integer.toOctalString(a));
        System.out.println(16+" "+Integer.toHexString(a).toUpperCase());
    }
}