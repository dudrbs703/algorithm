import java.util.Scanner;

/**
 * Print_1274
 */
public class Print_1274 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        int count = 0;
        
        for(int i=1; i<=a; i++)
        {
            if(a % i == 0) count++;
        }

        if(count <= 2) System.out.println("prime");
        else System.out.println("not prime");
    }
}