import java.util.Scanner;

/**
 * Print_1904
 */
public class Print_1904 {

    static int a = 0;
    static int b = 0; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        recursive(a);
    }

    public static void recursive(int n)
    {
        if(b >= n)
        {    
            if(n % 2 == 1)
            {
                System.out.print(n+" ");
            } 
            
            recursive(n+1);
        } 
    }
}