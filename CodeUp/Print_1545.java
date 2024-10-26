import java.util.Scanner;

/**
 * Print_1545
 */
public class Print_1545 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        f(scanner.nextInt());
        scanner.close();
    }

    public static void f(int n)
    {
       if(n == 0) System.out.println("zero");
       else System.out.println("non zero");
    }
}