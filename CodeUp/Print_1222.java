import java.util.Scanner;

/**
 * Print_1222
 */
public class Print_1222 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        for(int i=a; i<90; i++)
        {
            if(i%5 == 0) b++;
            System.out.println(i+" "+b);
        }

        if(b > c) System.out.println("win");
        else if(b < c) System.out.println("lose");
        else System.out.println("same");
    }
}