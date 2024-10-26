import java.util.Scanner;

/**
 * Print_1067
 */
public class Print_1067 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        scanner.close();
        
        if(a >= 0) System.out.println("plus");
        else if(a < 0)  System.out.println("minus");
        
        if(a % 2 == 0) System.out.println("even");
        else System.out.println("odd");
   
    }
}
