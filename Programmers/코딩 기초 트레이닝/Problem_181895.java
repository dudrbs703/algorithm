import java.util.ArrayList;
import java.util.List;

public class Problem_181895 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] interval = { { 1, 3 }, { 0, 4 } };

        List<Integer> answer = new ArrayList<>();
        for (int level = 0; level < interval.length; level++) {

            int from = interval[level][0];
            int to = interval[level][1];
            for (int i = from; i <= to; i++) {
                answer.add(arr[i]);
            }
        }

        System.out.println(answer);
    }
}
