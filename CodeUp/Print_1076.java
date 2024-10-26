import java.util.Scanner;

/**
 * Print_1076
 */
public class Print_1076 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int)scanner.next().charAt(0);
        scanner.close();

        int b = (int)'a';

        do{
            System.out.println((char)b);
            b+=1;
        } while(b <= a);

        //System.out.println((char)b);
    }
}