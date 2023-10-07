import java.util.Arrays;

public class Problem_181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution(int n, int k)
    {
        int []answer = new int[n/k];
        int position = 0;
        for(int i=0; i<=n; i++)
        {
            if(i == 0) continue;
            if(i % k == 0) answer[position++] = i; 
        }

        return answer;
    }
}
