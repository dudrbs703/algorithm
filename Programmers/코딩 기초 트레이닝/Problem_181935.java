public class Problem_181935 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean isEven = n % 2 == 0;

        for (int i = 1; i <= n; i++) {
            if (isEven && i % 2 == 0) {
                answer += (i * i);
                continue;
            }
            if (!isEven && i % 2 != 0) {
                answer += i;
                continue;
            }
        }

        return answer;
    }
}
