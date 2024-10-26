import java.util.Scanner;

/**
 * Print_1066
 */
public class Print_1068 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        scanner.close();
        
        if(a >= 90 && a <= 100) System.out.println("A");
        if(a >= 70 && a <= 89) System.out.println("B");
        if(a >= 40 && a <= 69) System.out.println("C");
        if(a >= 0 && a <= 39) System.out.println("D");
   
    }
}