import java.util.Scanner;

/**
 * Print_4051
 */
public class Print_4051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0.0;
        double a = 0.0;
        for(int i=0; i<5; i++)
        {
            double start = scanner.nextDouble();
            double end = scanner.nextDouble();

            double tmp = end - start;
            if(tmp < 1) continue;
            else if(tmp > 1 && tmp - 1 <= 4) a += (tmp - 1);
            else if(tmp > 4) a += 4;
        }
        scanner.close();

        result = 5000 * (a * 2);

        if(a >= 15) result *= 0.95;
        else if(a <= 5) result *= 1.05;

        System.out.println((int)result);
    }
}