import java.util.Scanner;

/**
 * Print_1095
 */
public class Print_1095 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []b = new int[a];

        for(int i=0; i<a; i++)
        {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int c = b[0];
        for(int i=0; i<b.length; i++)
        {
            if(b[i] < c) c = b[i];
        }

        System.out.println(c);
    }
}