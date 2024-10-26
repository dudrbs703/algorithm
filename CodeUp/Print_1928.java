import java.util.Scanner;

/**
 * Print_1904
 */
public class Print_1928 {

    static int a = 0;
    static int b = 0; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();
        recursive(a);
    }

    public static int recursive(int n)
    {
        System.out.println(n);
        if(n <= 1) return n;
        if (n % 2 == 1)
        {
            recursive(3*n+1);
        } else if(n % 2 == 0){
            recursive(n/2);
        }
        
        return n;
    }
}