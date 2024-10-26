import java.util.Scanner;

/**
 * Print_1260
 */
public class Print_1260 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int tmp = 0;
        for(int i=a; i<=b; i++)
        {
            if(i%3 == 0)
            {
                tmp+=i;
            }
        }

        System.out.println(tmp);
    }
}