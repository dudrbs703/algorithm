import java.util.Arrays;

public class Problem_181833 {
    public static void main(String[] args) {
        int n = 3;

        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (i == j)
                    answer[i][j] = 1;
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
