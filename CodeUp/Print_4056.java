import java.util.Scanner;

/**
 * Print_4056
 */
public class Print_4056 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        int result = 0;

        if(a <= 500) result = a * 70 / 100;
        else if(a > 500 && a <= 1500) result = 350 + (a - 500) * 40 / 100;
        else if(a > 1500 && a <= 4500) result = 750 + (a - 1500) * 15 / 100;
        else if(a > 4500 && a <= 10000) result = 1200 + (a - 4500) * 5 / 100;
        else if(a > 10000) result = 1475 + (a - 10000) * 2 / 100;

        System.out.println(result);
    }
}