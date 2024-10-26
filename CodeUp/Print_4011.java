import java.util.Scanner;

/**
 * Print_4011
 */
public class Print_4011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        String year = a.substring(0,2);
        String month = a.substring(2,4);
        String day = a.substring(4,6);
        int sex = Character.getNumericValue(a.charAt(7));

        String tmp = "";
        
        if(sex == 1 || sex == 2)
        {
            if(sex == 1) tmp = "19"+year+"/"+month+"/"+day+" M";
            if(sex == 2) tmp = "19"+year+"/"+month+"/"+day+" F";
        } 
        
        if(sex == 2 || sex == 3)
        {
            if(sex == 3) tmp = "20"+year+"/"+month+"/"+day+" M";
            if(sex == 4) tmp = "20"+year+"/"+month+"/"+day+" F";
        }

        System.out.println(tmp);
    }
}