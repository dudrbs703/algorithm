import java.util.Scanner;

/**
 * Print_1414
 */
public class Print_1414 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next().toLowerCase();
        scanner.close();

        int single_lowercase = 0;
        int double_lowercase = 0;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == 'c') single_lowercase++;
        }

        for(int i=0; i<a.length()-1; i++)
        {
            if(a.charAt(i) == 'c' && a.charAt(i+1) == 'c') double_lowercase++;
        }

        System.out.println(single_lowercase);
        System.out.println(double_lowercase);
    }
    
}