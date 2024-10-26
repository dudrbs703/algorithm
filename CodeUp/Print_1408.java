import java.util.Scanner;

/**
 * Print_1408
 */
public class Print_1408 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        String b = "";
        String c = "";
        
        for(int i=0; i<a.length(); i++)
        {
            b += String.valueOf((char)(a.charAt(i) + 2));
            c += String.valueOf((char)((a.charAt(i) * 7) % 80 + 48));
            //System.out.println(tmp +" "+ (char)tmp);
        }

        System.out.println(b);
        System.out.println(c);
        
    }
}