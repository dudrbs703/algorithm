import java.util.Scanner;

/**
 * Print_1025
 */
public class Print_1025
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       scanner.close();

       for(int i=0; i<s.length(); i++)
       {
           System.out.print("["+s.charAt(i));
           for(int j=i+1; j<s.length(); j++)
           {
                System.out.print("0");
           }
           System.out.println("]");
       }
    }
}