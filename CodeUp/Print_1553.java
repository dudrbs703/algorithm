import java.util.Scanner;

/**
 * Print_1553
 */
public class Print_1553 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(getCeilingNumber(scanner.nextDouble()));
        scanner.close();
    }

    public static double getCeilingNumber(double number)
    {
        long tmp = (long)number;
        if(tmp < number) return number + 1;
        return number;
    }
}