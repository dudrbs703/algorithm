import java.util.Arrays;

/**
 * Problem_120890
 */

public class Problem_120890 {

    public static void main(String[] args) {
        int []array = { 3, 10, 28 };
        int n = 20;
        
        Arrays.sort(array);
        int []proximity = new int[array.length];
        int min = Integer.MAX_VALUE;

        int answer = 0;
        for(int i=0; i<array.length; i++)
        {
            proximity[i] = Math.abs(n - array[i]);

            if(proximity[i] < min) {
                min = proximity[i];
                answer = array[i];
            }
            else if(proximity[i] == min && array[i] < answer) answer = array[i];
        }

        System.out.println(answer);
    }
}