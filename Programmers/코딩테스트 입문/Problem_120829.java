/**
 * Problem_120829
 */
public class Problem_120829 {

    public static void main(String[] args) {
        
        int angle = 70;
        
        if(angle > 90) System.out.println("1");
        else if(angle == 90) System.out.println("2");
        else if(angle > 90 && angle < 180) System.out.println("3");
        else if(angle == 180) System.out.println("4");
    }
}