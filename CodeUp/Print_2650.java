import java.util.Arrays;
import java.util.Scanner;

/**
 * Print_2650
 */
public class Print_2650 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []data = {
            scanner.nextInt(),
            scanner.nextInt(),
            scanner.nextInt()
        };
        scanner.close(); 
        Arrays.sort(data);
   
        for(int i=data[0]; i>=0; i--)
        {
            if(data[0] % i == 0 && data[1] % i == 0 && data[2] % i == 0) 
            {
                System.out.println(i);
                break;
            }
        }
    }
}