import java.util.Scanner;

/**
 * Print_1069
 */
public class Print_1069 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.next();
        scanner.close();
        
        switch(a.charAt(0))
        {
            case 'A':
                System.out.println("best!!!");
                break;
            
            case 'B':
                System.out.println("good!!");
                break;
            
            case 'C':
                System.out.println("run!");
                break;
            
            case 'D':
                System.out.println("slowly~");
                break;

            default:
                System.out.println("what?");
        }
   
    }
}