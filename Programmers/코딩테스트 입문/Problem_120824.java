import java.util.Arrays;

/**
 * Problem_120824
 */
public class Problem_120824 {

    public static void main(String[] args) {
        
        int []num_list = { 1, 2, 3, 4, 5 };
        
        int []answer = new int[2];

        int odd = 0;
        int even = 0;

        for(int i : num_list)
        {
            if(i % 2 == 0) even++;
            else odd++;
        }

        answer[0] = even;
        answer[1] = odd;

        System.out.println(Arrays.toString(answer));
    }
}