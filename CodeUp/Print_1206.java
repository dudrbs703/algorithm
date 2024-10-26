import java.util.Scanner;


/**
 * Print_1206
 */
public class Print_1206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        if(a == 11 || a == 12 || a == 13) System.out.println(a+"th");
        else if(a % 10 == 1) System.out.println(a+"st");
        else if(a % 10 == 2) System.out.println(a+"nd");
        else if(a % 10 == 3) System.out.println(a+"rd");
        else System.out.println(a+"th");
    }
}
