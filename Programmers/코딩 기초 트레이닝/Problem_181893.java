import java.util.Arrays;

/**
 * Problem_181893
 */
public class Problem_181893 {

    public static void main(String[] args) {
        
        int []arr = {
            0, 1, 2, 3, 4, 5
        };

        int []query = {
            4, 1, 2
        };

        int []answer = { };

        for(int i : query)
        {

            answer = new int[arr.length -1];

            for(int j=0; j<answer.length; j++)
            {
                if(i == j) continue;
                else answer[j] = arr[i];
            }

        }


        System.out.println(Arrays.toString(answer));
    }
}