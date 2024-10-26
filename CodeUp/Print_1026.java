import java.util.Scanner;

/**
 * Print_1026
 */
public class Print_1026
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.next();
       scanner.close();

       //String hour = s.split(":")[0];
       String minute = s.split(":")[1];
       //String second = s.split(":")[2];

       System.out.println(Integer.parseInt(minute));

    }
}