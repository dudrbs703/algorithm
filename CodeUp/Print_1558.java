import java.util.Scanner;

/**
 * Print_1558
 */
public class Print_1558 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printReverseNumber(scanner.next());
        scanner.close();
    }

    public static void printReverseNumber(String s)
    {
        for(int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}