import java.util.Scanner;

/**
 * Print_1430
 */


public class Print_1430
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a[] = new int[scanner.nextInt()];
        for(int i=0; i<a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
            
        int b[] = new int[scanner.nextInt()];
        for(int i=0; i<b.length; i++)
        {
            b[i] = scanner.nextInt();
        }

        int c = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; i<=b.length; j++)
            {
                if(a[i] == b[j]) {
                    System.out.print("1"+" ");
                    continue;
                } else {
                    c = 0;
                }
            }
            System.out.print("0"+" ");
        }

        
    }
}