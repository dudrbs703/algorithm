import java.util.Arrays;

public class Problem_181920 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        System.err.println(Arrays.toString(solution(start_num, end_num)));
    }

    public static int[] solution(int start_num, int end_num) {
        int len = (end_num - start_num) + 1;
        int[] answer = new int[len];
        int position = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[position++] = i;
        }
        return answer;
    }
}
