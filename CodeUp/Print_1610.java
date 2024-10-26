import java.util.Scanner;

/**
 * Print_1610
 */
public class Print_1610 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int count = 1;
        for(int i=b; i<a.length(); i++)
        {
            System.out.print(a.charAt(i));
            if(count >= c) break;
            else count++;
        }
    }
}