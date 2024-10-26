import java.util.Scanner;

/**
 * Print_1088
 */
public class Print_1088 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        scanner.close();

        for(int i=1;i<=a;i++)
        {
            if(i%3 == 0) {
                //System.out.println(b);
                continue;
            }
            System.out.println(i);
        }
    }
}