import java.util.Scanner;

/**
 * Print_1124
 */
public class Print_1124 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        int c_atomic_weight = 12;
        int h_atomic_weight = 1;
        
        int c = 0;
        StringBuilder builder = new StringBuilder();
        if(a.charAt(0) == 'C') {
            c = Character.getNumericValue(a.charAt(1));
            for(int i=3; i<a.length(); i++)
            {
                builder.append(String.valueOf(a.charAt(i)));
            }
        } else {
            for(int i=2; i<a.length(); i++)
            {
                builder.append(String.valueOf(a.charAt(i)));
            }
        }
        
        int result = (c * c_atomic_weight) + (Integer.parseInt(builder.toString()) * h_atomic_weight); 

        System.out.println(result);
    }
}