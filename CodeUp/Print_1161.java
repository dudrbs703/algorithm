import java.util.Scanner;

/**
 * Print_1161
 */
public class Print_1161 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();


        if(a % 2 == 0) System.out.print("짝수+");
        else System.out.print("홀수+");

        if(b % 2 == 0) System.out.print("짝수=");
        else System.out.print("홀수=");

        if((a+b) % 2 == 0) System.out.print("짝수");
        else System.out.print("홀수");
        
    }
}