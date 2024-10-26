import java.util.Scanner;

/**
 * Print_3301
 */
public class Print_3301 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        int count = 0;
        while(true)
        {
            while(a>=50000)
            {
                a-=50000;
                count++;
            }

            while (a>=10000) {
                a-=10000;
                count++;
            }

            while(a>=5000)
            {
                a-=5000;
                count++;
            }

            while(a>=1000)
            {
                a-=1000;
                count++;
            }

            while(a>=500)
            {
                a-=500;
                count++;
            }

            while(a>=100)
            {
                a-=100;
                count++;
            }

            while(a>=50)
            {
                a-=50;
                count++;
            }

            while(a>=10)
            {
                a-=10;
                count++;
            }

            break;
        }

        System.out.println(count);

    }
}