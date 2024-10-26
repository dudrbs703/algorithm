import java.util.Scanner;

/**
 * Print_1929
 */
public class Print_1929 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        recursive(scanner.nextInt());
        scanner.close();
    }

    public static void recursive(int n)
    {
        if(n == 1);
        else if (n % 2 == 0) recursive(n/2);
        else recursive(3*n+1);
        System.out.println(n);
    }
}
