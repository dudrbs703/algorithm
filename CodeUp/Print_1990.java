import java.util.Scanner;

/**
 * Print_1990
 */
public class Print_1990 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        //int []b = new int[a.length()];
        int c = 0;

        for(int i=0; i<a.length(); i++)
        {
            c += Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        if(c%3 == 0) System.out.println("1");
        else System.out.println("0");
    }
}