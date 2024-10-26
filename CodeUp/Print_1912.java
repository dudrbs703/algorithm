import java.util.Scanner;

/**
 * Print_1912
 */
public class Print_1912 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(recursive(scanner.nextInt()));
        scanner.close();
    }

    public static int recursive(int a)
    {
        if(a <= 1) return a;
        else return a*recursive(a-1);
    }
}