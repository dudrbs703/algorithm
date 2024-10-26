import java.util.Scanner;

/**
 * Print_1419
 */
public class Print_1419 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        scanner.close();

        int count = 0;

        for(int i=0; i<a.length();i++)
        {
            if(a.charAt(i) == 'l'
                && a.charAt(i+1) == 'o' 
                && a.charAt(i+2) == 'v' 
                && a.charAt(i+3) == 'e')  
            { 
                count++;
            } 
        }

        System.out.println(count);
    }
}