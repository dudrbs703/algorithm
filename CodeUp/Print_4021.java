import java.util.Scanner;

/**
 * Print_4021
 */
public class Print_4021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        for(int i=0; i<7; i++)
        {
            int a = scanner.nextInt();
            if(a % 2 != 0) result += a;
        }
        scanner.close();

        if(result == 0) System.out.println("-1");
        else System.out.println(result);
    }
}