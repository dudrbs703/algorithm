import java.util.Scanner;

/**
 * Print_1254
 */
public class Print_1255 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();

        if(a > b) {
            for(double i=b; i<a; i+=0.01)
            {
                System.out.format("%.2f", i);
                System.out.println();
            }
        } 
        
        if(a == b) System.out.println(a);
        else {
            for(double i=a; i<b; i+=0.01)
            {
                System.out.format("%.2f", i);
                System.out.println();
            }
        }
    }
}