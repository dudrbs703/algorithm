import java.util.Scanner;

/**
 * Print_1228
 */
public class Print_1228 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();

        double c = (a-100) * 0.9;
        double d = (b-c) * 100 /c;

        if(d <= 10) System.out.println("정상");
        else if(d >=10 && d <= 20) System.out.println("과체중");
        else System.out.println("비만");

    }
}