import java.util.Scanner;

/**
 * Print_1218
 */
public class Print_1218 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //(int)Math.pow(scanner.nextInt(), 2);
        int b = scanner.nextInt(); //(int)Math.pow(scanner.nextInt(), 2);
        int c = scanner.nextInt(); //(int)Math.pow(scanner.nextInt(), 2);
        scanner.close();

        
        if((a + b > c) && (b + c > a) && (c + a > b))
        {
            if(a == b && b == c) System.out.println("정삼각형");
            else if(a == b || a == c || b == c) System.out.println("이등변삼각형");
            else if(((a*a) + (b*b)) == (c*c)) System.out.println("직각삼각형");
            else System.out.println("삼각형");
        }
        else System.out.println("삼각형아님");
  
    }
}