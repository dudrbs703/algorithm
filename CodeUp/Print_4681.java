import java.util.Scanner;

/**
 * Print_4681
 */
public class Print_4681 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tmp = 0;
        int result = 0;
        for(int i=0; i<5; i++)
        {
            tmp = scanner.nextInt();
            result += tmp * tmp;
        }
        scanner.close();

        System.out.println(result%10);
    }
}