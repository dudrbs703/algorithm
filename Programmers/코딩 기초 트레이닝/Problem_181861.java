import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_181861 {
    public static void main(String[] args) {

        int[] arr = { 5, 1, 4 };

        List<Integer> tmp = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                tmp.add(i);
            }
        }

        int[] result = tmp.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(result));

    }
}
