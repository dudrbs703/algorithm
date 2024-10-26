import java.util.Scanner;

/**
 * Print_1273
 */
public class Print_1273 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=a; i++)
        {
            if(a % i == 0 ) System.out.print(i+" ");
        }
    }
}