import java.util.Arrays;

public class Problem_181924 {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {

        int len = queries.length;
        for (int i = 0; i < len; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        return arr;
    }

}
