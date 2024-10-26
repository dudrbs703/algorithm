import java.util.Scanner;

/**
 * Print_4571
 */
public class Print_4571 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int a = scanner.nextInt();
         int b = scanner.nextInt();
         scanner.close();

         int tmp = 0;

         int result = 0;
         int min = Integer.MAX_VALUE;
         for(int i=1; i<=b; i++)
         {
            tmp = i*i;
            if(tmp >= a && tmp <= b)
            {
                result += tmp;

                min = Math.min(tmp, min);
            }
         }

         System.out.println(result);
         System.out.println(min);
    }
}