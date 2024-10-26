import java.util.Scanner;

/**
 * Print_1082
 */
public class Print_1082 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next(), 16);
        scanner.close();



        for(int i=1; i<=15; i++)
        {
            System.out.println(a*i);
        }

        /*
        for(int i=1; i<=15; i++)
        {
            System.out.print(Integer.toHexString(a).toUpperCase()+"*"+Integer.toHexString(i).toUpperCase()+"=");
            System.out.println(Integer.toHexString(a*i).toUpperCase());
        }*/
    }
}