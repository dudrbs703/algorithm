import java.util.Scanner;

/**
 * Print_1092
 */
public class Print_1092 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int day = 1;
        while(day % a != 0 || day % b != 0 || day % c != 0)
        {
            day++;
        }
        
        System.out.println(day);
    }
}