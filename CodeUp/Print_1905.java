import java.util.Scanner;

/**
 * Print_1905
 */
public class Print_1905 {

    static int a = 0;
    static int count = 0;
    static int b = 0; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();
        System.out.println(recursive(1));
    }

    public static int recursive(int n)
    {
        if(count < a)
        {    
            b+=n;
            count++;
            recursive(n+1);
        } 
        
        return b;
    }
}