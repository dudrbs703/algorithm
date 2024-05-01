import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem_181860
 */
public class Problem_181860 {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 4, 1, 3 };
        boolean[] flag = { true, false, true, false, false };

        Deque<Integer> tmp = new LinkedList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    tmp.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    tmp.pollLast();
                }
            }
        }

        tmp.stream().mapToInt(i -> i).toArray();
        System.out.println(tmp);
    }
}