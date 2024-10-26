import java.util.Scanner;

/**
 * Print_1259
 */
public class Print_1259 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        int tmp = 0;
        for(int i=1; i<=a; i++)
        {
            if(i%2 == 0)
            {
                tmp+=i;
            }
        }

        System.out.println(tmp);
    }
}