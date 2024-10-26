import java.util.Scanner;

/**
 * Print_1552
 */
public class Print_1552 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        scanner.close();

        System.out.println(String.format("%.14f", a-(int)a));

        /*
        int position = 0;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == '.'){
                position = i;
                break;
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int i=position+1; i<a.length(); i++)
        {
            builder.append(a.charAt(i));
        }

        for(int i=builder.length(); i<14; i++)
        {
            builder.append("0");

        }

        
        

        System.out.println((double)Integer.parseInt(builder.toString()));*/
        
    }
}