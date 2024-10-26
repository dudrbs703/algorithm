import java.util.Scanner;

/**
 * Print_1216
 */
public class Print_1216 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        if((b-c)>a) System.out.println("advertise");
        else if((b-c)<a) System.out.println("do not advertise");
        else System.out.println("does not matter");

    }
}