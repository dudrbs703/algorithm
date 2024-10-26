import java.util.Scanner;

/**
 * Print_1440
 */
public class Print_1440 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[scanner.nextInt()];
        for(int i=0; i<a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        
        for(int i=0; i<a.length; i++)
        {
            System.out.print((i+1)+": ");
            for(int j=0; j<a.length;j++)
            {
                if(i == j) continue;
                if(a[i] > a[j]) System.out.print(">"+" ");
                if(a[i] < a[j]) System.out.print("<"+" ");
                if(a[i] == a[j]) System.out.print("="+" ");
            }

            System.out.println();
        }
    }
}