/**
 * Problem_120817
 */
public class Problem_120817 {

    public static void main(String[] args) {
        
        int []numbers = { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };

        int tmp = 0;

        for(int n : numbers)
        {
            tmp += n;
        }

        System.out.println((tmp * 1.0 / numbers.length));

    }
}