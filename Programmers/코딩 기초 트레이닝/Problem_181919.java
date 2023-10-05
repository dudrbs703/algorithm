import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem_181919
 */
public class Problem_181919 {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {

        List<Integer> answer = new ArrayList<>();

        while (n != 1) {
            answer.add(n);
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        answer.add(n);

        return answer.stream().mapToInt(i -> i).toArray();

    }
}