import java.util.Scanner;

/**
 * Print_1231
 */
public class Print_1231 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        int b = 0;
        int c = 0;

        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == '+')
            {
                b = Integer.parseInt(a.split("\\+")[0]);
                c = Integer.parseInt(a.split("\\+")[1]);
                System.out.println(b+c);
                break;
            }

            if(a.charAt(i) == '-')
            {
                b = Integer.parseInt(a.split("\\-")[0]);
                c = Integer.parseInt(a.split("\\-")[1]);
                System.out.println(b-c);
                break;
            }

            if(a.charAt(i) == '*')
            {
                b = Integer.parseInt(a.split("\\*")[0]);
                c = Integer.parseInt(a.split("\\*")[1]);
                System.out.println(b*c);
                break;
            }

            if(a.charAt(i) == '/')
            {
                b = Integer.parseInt(a.split("\\/")[0]);
                c = Integer.parseInt(a.split("\\/")[1]);
                System.out.format("%.2f", (double)b / (double)c);
                break;
            }
        }
       
    }
}