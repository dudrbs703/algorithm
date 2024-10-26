import java.util.Scanner;

/**
 * Print_1548
 */
public class Print_1548 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    public static char f(int n)
    {
        if(n >= 90 && n <= 100) return 'A';
        if(n >= 80 && n < 90) return 'B';
        if(n >= 70 && n < 80) return 'C';
        if(n >= 60 && n < 70) return 'D';
        else return 'F';

    }
}