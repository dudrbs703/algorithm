import java.util.Scanner;

/**
 * Print_1270
 */
public class Print_1270 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        int count = 0;

        if(a <= 9){
             System.out.println("1");
             System.exit(0);
        } else {
            for(int i=1; i<=a; i++)
            {
                if(String.valueOf(i).endsWith("1")) count++;
            }
        }

        System.out.println(count);
    }
}