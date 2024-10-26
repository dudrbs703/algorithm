import java.util.Scanner;

/**
 * Print_1252
 */
public class Print_1252 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=a; i++)
        {
            System.out.print(i+" ");
        }
    }
}