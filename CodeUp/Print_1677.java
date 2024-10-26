import java.util.Scanner;

/**
 * Print_1677
 */
public class Print_1677 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.print("+");
        for(int i=0; i<a-2; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
        
        for(int i=0; i<b-2; i++)
        {
            System.out.print("|");
            for(int j=0; j<a-2; j++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("+");
        for(int j=0; j<a-2; j++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
}