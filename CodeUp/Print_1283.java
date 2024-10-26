import java.util.Scanner;

/**
 * Print_1283
 */
public class Print_1283 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int []data = new int[b];
        float result = a;

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
            result += (result * data[i]) / 100;
        }

        scanner.close();
      
        System.out.println(String.format("%.0f", result-a));

        if( result > a) System.out.println("good");
        else if( a == result) System.out.println("same");
        else System.out.println("bad");
    }
}