import java.util.Scanner;

/**
 * Print_1567
 */
public class Print_1567 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        long []data = new long[a];
        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextLong();
        }

        int b = scanner.nextInt() -1;
        int c = scanner.nextInt() -1;
        scanner.close();

        long result = 0;
        
        for(int i=b; i<=c; i++)
        {
            result+= data[i];
        }

        System.out.println(result);
    }
}