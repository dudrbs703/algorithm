import java.util.Arrays;

/**
 * Problem_120899
 */
public class Problem_120899 {

    public static void main(String[] args) {
        int []array = { 1, 8, 3};

        int []answer = new int[2];

        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++)
        {
            if(max < array[i]) 
            {
                max = array[i];
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}