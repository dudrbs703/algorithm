import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Print_1085
 */
public class Print_1086 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();
        scanner.close();
        int bit = 8;

        int a = 0;

        if(width >= 1 && width <= 1024 && depth <= 40 && depth % 4 == 0)
        {
            a = width * height * depth / bit;
        }

        double tmp = a / Math.pow(2 , 10) / Math.pow(2, 10);

        // Test
        // 1024 768 24
        // 100 100 4
        System.out.println(String.format("%.2f MB", tmp));    
    }
}