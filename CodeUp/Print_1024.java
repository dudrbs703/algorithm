import java.util.Scanner;

/**
 * Print_1024
 */
public class Print_1024
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       scanner.close();

       for(int i=0; i<s.length(); i++)
       {
           System.out.println("'"+s.charAt(i)+"'");
       }
    }
}