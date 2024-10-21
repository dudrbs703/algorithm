import java.util.Arrays;

/**
 * Problem_120821
 */
public class Problem_120821 {

    public static void main(String[] args) {
        int []num_list = { 1, 2, 3, 4, 5 };
        int []answer = new int[num_list.length];
        int position = 0;

        for(int i=num_list.length-1; i>=0; i--)
        {
            answer[position++] = num_list[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}