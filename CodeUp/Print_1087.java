import java.util.Scanner;

/**
 * Print_1087
 */
public class Print_1087 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 0;

        for(int i=1;;i++)
        {
            if(b >= a) {
                System.out.println(b);
                break;
            }
            b+=i;
        }
    }
}