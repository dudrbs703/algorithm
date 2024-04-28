import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_181888 {
    public static void main(String[] args) {

        int[] num_list = { 4, 2, 6, 1, 7, 6 };
        int n = 2;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0)
                result.add(num_list[i]);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
