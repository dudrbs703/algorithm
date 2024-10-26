import java.util.Scanner;

/**
 * Print_1169
 */
public class Print_1169 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        scanner.close();

        int birth = Integer.parseInt(String.valueOf(String.valueOf(2012 - age + 1)));

        //System.out.println(birth);
        int a = Integer.parseInt(String.valueOf(birth).substring(2,4));
        if(birth / 100 == 19 )
        {
            
            //System.out.println(a);
            if(a < 10 ) System.out.println(String.valueOf(birth).charAt(3)+" "+1);
            else System.out.println(String.valueOf(birth).substring(2,4)+" "+1);
        } 
        
        if(birth / 100 == 20){

            if(a < 10) System.out.println(String.valueOf(birth).charAt(3)+" "+3);
            else System.out.println(String.valueOf(birth).substring(2,4)+" "+3);
        }

        //113
        //0 1
    }
}