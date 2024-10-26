import java.util.Scanner;

/**
 * Print_1544
 */
public class Print_1544 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        f(scanner.nextInt());
        scanner.close();
    }

    public static void f(int n)
    {
       for(int i=0; i<n; i++)
       {
           System.out.print("*");
       }
    }
}