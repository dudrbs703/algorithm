import java.util.Scanner;

/**
 * Print_1295
 */
public class Print_1295 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = "";

        scanner.close();

        for(int i=0; i<a.length(); i++)
        {
            //System.out.println((int)a.charAt(i));
            
            if(a.charAt(i) >= 65 && a.charAt(i) <= 90)
            {
                b+=String.valueOf(a.charAt(i)).toLowerCase();
                continue;
            } 
            
            if(a.charAt(i) >= 97 && a.charAt(i) <= 122) 
            {
                b+=String.valueOf(a.charAt(i)).toUpperCase();
                continue;
            } else {
                b+=a.charAt(i);
            }

        }

        System.out.println(b);
        
    }
}

// cODEcHALLENGE2014WITHmsp
// cODEcHALLENGEWITHmsp