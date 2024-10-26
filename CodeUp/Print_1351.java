import java.util.Scanner;

/**
 * Print_1351
 */
public class Print_1351 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(a != b) {
            for(int i=a; i<=b; i++)
            {
                for(int j=1; j<=9; j++)
                {
                    System.out.println(i+"*"+j+"="+(i*j));
                }
            }
        } else {
            for(int i=1; i<=9; i++)
            {
                System.out.println(a+"*"+i+"="+(a*i));
            }
        }
       
    }
}