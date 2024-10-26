import java.util.Scanner;

/**
 * Print_1537
 */
public class Print_1537 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch(scanner.nextInt())
        {
            case 1:
                System.out.println("hello");
                break;

            case 2:
                System.out.println("world");
                break;
        }

        scanner.close();
    }
}