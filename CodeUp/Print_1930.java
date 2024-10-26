import java.util.Scanner;

/**
 * Print_1930
 */
public class Print_1930 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt())
        {
            System.out.println(recursion(scanner.nextInt(), scanner.nextInt()));
        }
        scanner.close();
    }

    static int [][]data = new int[15][15];

    public static int recursion(int k, int n)
    {
        if(k == 0) {
            data[k][n] = n;
            return n;
        }

        if(data[k][n] != 0) return data[k][n];

        for(int i=1; i<=n; i++)
        {
            data[k][n] += recursion(k-1, i);
        }
        return data[k][n];
    }
}