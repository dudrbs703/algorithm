import java.util.Scanner;

/**
 * Print_1021
 */
public class Print_1021 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       scanner.close();

       //char []tmp = new char[s.length()];

       for(int i=0; i<s.length(); i++)
       {
           System.out.print(s.charAt(i));
       }
    }
}