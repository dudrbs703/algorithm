import java.util.Scanner;

/**
 * Print_1412
 */


public class Print_1412 
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int []alpahbet = new int[26];

        for(int i=0; i<a.length(); i++)
        { 
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
            {
                alpahbet[(int)(a.charAt(i)) % 97] +=1;
            } 
        }

        for(int i=0; i<alpahbet.length; i++)
        {
            System.out.println((char)(97+i)+":"+alpahbet[i]);
        }    
    }
}