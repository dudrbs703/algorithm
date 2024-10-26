import java.util.Scanner;

/**
 * Print_1754
 */
public class Print_1754 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        char a_size[] = a.toCharArray();
        char b_size[] = b.toCharArray();

        if(a.length() > b.length()) System.out.println(b +" " + a); 
        else if(a.length() < b.length()) System.out.println(a +" " + b);  
        else {
            for(int i=0; i<a_size.length; i++)
            {
                if(Character.getNumericValue(a_size[i]) > Character.getNumericValue(b_size[i])) {
                    System.out.println(b +" " + a);
                    break;
                }
                else if(Character.getNumericValue(a_size[i]) < Character.getNumericValue(b_size[i])){
                    System.out.println(a +" " + b);
                    break;
                }
            }
        }
    }
}