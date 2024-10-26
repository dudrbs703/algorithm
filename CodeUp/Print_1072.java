import java.util.Scanner;

/**
 * Print_1072
 */
public class Print_1072 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int time = scanner.nextInt();

        int []data = new int[time];
        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
            System.out.println(data[i]);
        }
        
        scanner.close();
    }
}