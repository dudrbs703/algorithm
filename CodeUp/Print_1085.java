import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Print_1085
 */
public class Print_1085 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long hz = scanner.nextLong();
        long bit = scanner.nextInt();
        long channel = scanner.nextInt();
        long sec = scanner.nextInt();
        
        scanner.close();

        double result = ((hz * bit * channel * sec) / 8) / Math.pow(2, 10) / Math.pow(2, 10);
       
        //Test
        //44100 16 2 10
        //8000 8 1 60
        //48000 32 5 300

        System.out.println(String.format("%.1f MB", result));
    }
}