import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


/**
 * Print_1205
 */
public class Print_1205 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        double tmp = a + b;

        if(a - b > tmp) tmp = a - b;
        if(a * b > tmp) tmp = a * b;
        if(a / b > tmp) tmp = a / b;
        if((int)Math.pow(a, b) > tmp) tmp = Math.pow(a, b);

        if(b - a > tmp) tmp = b - a;
        if(b * a > tmp) tmp = b * a;
        if(b / a > tmp) tmp = b / a;
        if((int)Math.pow(b, a) > tmp) tmp = Math.pow(b, a);

        System.out.format("%.6f", tmp);
    }
}

// -1 -1
// 1.000000


// 2 -1
// 3.000000