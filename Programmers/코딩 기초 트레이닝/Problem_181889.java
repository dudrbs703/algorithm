import java.util.ArrayList;
import java.util.List;

/**
 * Problem_181889
 */
public class Problem_181889 {

    public static void main(String[] args) {
        int[] num_list = { 5, 2, 1, 7, 5 };
        int n = 3;

        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i + 1 <= n)
                tmp.add(num_list[i]);

        }

        System.out.println(tmp);
    }
}