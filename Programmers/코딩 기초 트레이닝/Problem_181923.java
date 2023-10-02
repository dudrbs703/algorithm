import java.util.Arrays;

public class Problem_181923 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 3 };
        int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {

        int len = queries.length;
        int[] answer = new int[len];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int i = 0; i < len; i++) {

            int from = queries[i][0];
            int to = queries[i][1];
            int standard = queries[i][2];

            for (int j = from; j <= to; j++) {
                if (arr[j] > standard)
                    answer[i] = Math.min(answer[i], arr[j]);
            }
            if (answer[i] == Integer.MAX_VALUE)
                answer[i] = -1;
        }
        return answer;
    }
}
