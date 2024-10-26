import java.util.Scanner;

/**
 * Print_1541
 */
public class Print_1541 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    public static String f(int n)
    {
        if(n < 0) return "negative";
        else if(n == 0) return "zero";
        else return "positive";
    }
}