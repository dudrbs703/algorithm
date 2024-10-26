import java.util.Scanner;

/**
 * Print_1023
 */
public class Print_1023 
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       scanner.close();

       String tmp[] = s.split("[.]");

       System.out.println(tmp[0]);
       System.out.println(tmp[1]);
    }
}