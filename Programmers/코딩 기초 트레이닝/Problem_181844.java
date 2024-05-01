import java.util.ArrayList;
import java.util.List;

/**
 * Problem_181844
 */
public class Problem_181844 {

    public static void main(String[] args) {
        int[] arr = { 293, 1000, 395, 678, 94 };
        int[] delete_list = { 94, 777, 104, 1000, 1, 12 };

        List<Integer> answer = new ArrayList<>();

        for (int i : delete_list) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i)
                    arr[j] = -1;
            }
        }

        for (int i : arr) {
            if (i != -1)
                answer.add(i);
        }

        System.out.println(answer);

    }
}