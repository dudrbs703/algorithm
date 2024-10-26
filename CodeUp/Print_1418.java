import java.util.Scanner;

/**
 * Print_1408
 */
public class Print_1418 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == 't') System.out.print((i+1)+" ");
        }

    }
}