import java.util.Scanner;

/**
 * Print_1083
 */
public class Print_1083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=a;i++)
        {
            if(i%3 == 0 || i%6 == 0) System.out.println("X");
            else
            {
                System.out.println(i);
                continue;
            }
        }
        
    }
}