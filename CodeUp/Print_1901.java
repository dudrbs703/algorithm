import java.util.Scanner;

/**
 * Print_1901
 */
public class Print_1901 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibo(scanner.nextInt());
    }

    public static void fibo(int n)
    {
        if(n >= 1) {
            System.out.println(n);
            fibo(n-1);
        }
    }
}