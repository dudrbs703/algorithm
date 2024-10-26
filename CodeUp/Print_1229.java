import java.util.Scanner;

/**
 * Print_1229
 */
public class Print_1229 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        scanner.close();

        double standard = 0;
        if(height < 150) standard = height - 100;
        else if(height >= 150 && height < 160) standard = (height - 150) / 2 + 50;
        else standard = (height - 100) * 0.9;
        
        double bmi = (weight - standard) * 100 / standard;

        if(bmi <= 10) System.out.println("정상");
        else if(bmi >=10 && bmi <= 20) System.out.println("과체중");
        else System.out.println("비만");

    }
}

// 182.4 81.67 과체중