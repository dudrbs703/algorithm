import java.util.Scanner;

/**
 * Print_1916
 */
public class Print_1916 {

    static int []dp = new int[201];
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println(fibo(scanner.nextInt()));
        scanner.close();
    }

    public static int fibo(int a)
    {
        if(a == 1 || a == 2) return 1;
        if(dp[a] != 0) return dp[a];
        return dp[a] = (fibo(a-1) + fibo(a-2)) % 10009;
    }
}