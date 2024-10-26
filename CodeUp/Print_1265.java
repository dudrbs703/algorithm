import java.util.Scanner;

/**
 * Print_1265
 */
public class Print_1265 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=9; i++)
        {
            System.out.println(a+"*"+i+"="+(i*a));
        }
    }
}