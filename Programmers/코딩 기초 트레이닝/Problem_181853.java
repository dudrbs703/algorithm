import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem_181853 {

    public static void main(String[] args) {
        int[] num_list = { 12, 4, 15, 46, 38, 1, 14 };

        List<Integer> tmp = new ArrayList<>();

        for (int n : num_list)
            tmp.add(n);

        Collections.sort(tmp);

        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = tmp.get(i);
        }

        System.out.println(Arrays.toString(result));

    }
}