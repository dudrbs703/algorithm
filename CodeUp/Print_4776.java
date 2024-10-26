import java.util.Scanner;

/**
 * Print_4776
 */
public class Print_4776 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt() - 1;
        scanner.close();

        char []a = { 'J','K','L','A','B','C','D','E','F','G','H','I' };
        int []b = { 7,8,9,0,1,2,3,4,5,6 };
        
        System.out.print(a[year % 12]);
        System.out.print(b[year % 10]);
    }
}