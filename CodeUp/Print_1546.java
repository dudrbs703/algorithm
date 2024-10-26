import java.util.Scanner;

/**
 * Print_1546
 */
public class Print_1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        f(scanner.nextInt());
        scanner.close();
    }

    public static void f(int n)
    {
       if(n > 0) System.out.println("plus");
       else if(n < 0) System.out.println("minus");
       else System.out.println("zero");
    }
}