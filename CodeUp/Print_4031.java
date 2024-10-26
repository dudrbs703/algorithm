import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4031
 */
public class Print_4031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []data = new int[7];
       
        int odd = 0;
        int even = 0;

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
            if(data[i] % 2 == 0) even++;
            else odd++;
        }
        scanner.close();

        if(odd == 7 && even == 0 || odd == 0 && even == 7) 
        {
            System.out.println(data[0]);
            System.exit(0);
        } else {
            odd = 0;
            even = 0;

            for(int i=0; i<data.length; i++)
            {
                if(data[i] % 2 == 0 && data[i] > even) even = data[i];
                else if(data[i] > odd) odd = data[i];
            }
        }

        System.out.println(odd+even);
    }
}