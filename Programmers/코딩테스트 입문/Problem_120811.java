import java.util.Arrays;

/**
 * Problem_120811
 */
public class Problem_120811 {

    public static void main(String[] args) {
        int []array = { 1, 2, 7, 10, 11 };

        Arrays.sort(array);

        System.out.println(array[array.length/2]);
    }
}