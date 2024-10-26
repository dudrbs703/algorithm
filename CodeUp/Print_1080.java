import java.util.Scanner;

/**
 * Print_1079
 */
public class Print_1080 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        
        for(int i=1; b<=1000;i++)
        {
            b+=i;
            if(b >= a) {
                System.out.println(i);
                break;
            }
        }
        scanner.close();
    }
}