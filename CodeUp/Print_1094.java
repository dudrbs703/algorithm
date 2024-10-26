import java.util.Scanner;

/**
 * Print_1094
 */
public class Print_1094 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []b = new int[a];

        for(int i=0; i<a; i++)
        {
            b[i] = scanner.nextInt();;
        }
        scanner.close();

        for(int i=b.length-1; i>=0; i--)
        {
            System.out.print(b[i]+" ");
        }
    }
}