import java.util.Arrays;

/**
 * Problem_120809
 */
public class Problem_120809 {

    public static void main(String[] args) {
        
        int []numbers = { 1, 2, 100, -99, 1, 2, 3 };

        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}