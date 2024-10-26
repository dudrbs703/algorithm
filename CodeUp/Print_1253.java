import java.util.Scanner;

/**
 * Print_1253
 */
public class Print_1253 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(b<a) {
            int c = b;
            b = a;
            a = c;
        }
        
        for(int i=a; i<=b; i++)
        {
            System.out.print(i+" ");
        }
    }
}