import java.util.ArrayList;
import java.util.List;

public class Problem_181835 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 100, 99, 98 };
        int k = 3;

        List<Integer> answer = new ArrayList<>();

        if (k % 2 == 0) {
            for (int i : arr) {
                answer.add(k + i);
            }
        } else {
            for (int i : arr) {
                answer.add(k * i);
            }
        }

        System.out.println(answer);
    }
}
