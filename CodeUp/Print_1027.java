import java.util.Scanner;

/**
 * Print_1027
 */
public class Print_1027
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.next();
       scanner.close();

       String year = s.split("[.]")[0];
       String month = s.split("[.]")[1];
       String day = s.split("[.]")[2];

       System.out.println(day+"-"+month+"-"+year);

    }
}