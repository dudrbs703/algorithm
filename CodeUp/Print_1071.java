import java.util.Scanner;

/**
 * Print_1071
 */
public class Print_1071 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        
        while (true)
        {
            a = scanner.nextInt();
            if(a == 0) break;
            else {
                System.out.println(a);
                continue;
            }
        }
       
        scanner.close();
    }
}