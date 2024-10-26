import java.util.Arrays;
import java.util.Scanner;

/**
 * Print_1563
 */
public class Print_1563 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(mid(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static int mid(int a, int b, int c)
    {
        int []data = new int[3];
        data[0] = a;
        data[1] = b;
        data[2] = c;

        Arrays.sort(data);

        return data[1];
    }
}