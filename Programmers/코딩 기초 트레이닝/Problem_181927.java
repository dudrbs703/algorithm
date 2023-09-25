import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem_181927 {

    public static void main(String[] args) {
        int[] num_list = { 5, 2, 1, 7, 5 };

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int tmp1 = num_list[len - 1];
        int tmp2 = num_list[len - 2];

        int tmp3 = tmp1 > tmp2 ? tmp1 - tmp2 : tmp1 * 2;
        int[] answer = new int[len + 1];
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = tmp3;

        return answer;
    }
}
