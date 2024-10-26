import java.util.Scanner;

/**
 * Print_1441
 */
public class Print_1441 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[scanner.nextInt()];

        for(int i=0; i<a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}