import java.util.Arrays;
import java.util.Scanner;

/**
 * Print_4531
 */
public class Print_4531 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []data = new int[5];
        int tmp = 0;

        for(int i=0; i<data.length; i++)
        {
            tmp += data[i] = scanner.nextInt();
            
        }
        scanner.close();

        Arrays.sort(data);
        System.out.println(tmp/5);
        System.out.println(data[5/2]);
    }
}