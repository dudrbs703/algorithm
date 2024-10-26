import java.util.Scanner;

/**
 * Print_1127
 */
public class Print_1127 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float c = 0;

        for(int i = 0; i<3; i++)
        {
            c += scanner.nextFloat() * scanner.nextFloat();
        }

        System.out.println(String.format("%.1f", c));
    }
}