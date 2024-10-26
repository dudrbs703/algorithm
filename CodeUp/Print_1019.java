import java.util.Scanner;

/**
 * Print_1019
 */
public class Print_1019 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String s = scanner.next();
       scanner.close();

       String []tmp = s.split("[.]");
       int year = Integer.parseInt(tmp[0]);
       int month = Integer.parseInt(tmp[1]);
       int day = Integer.parseInt(tmp[2]);
       
       System.out.println(String.format("%04d.%02d.%02d", year, month, day ));
    }
}