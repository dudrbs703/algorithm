public class Problem_181931 {

    public static void main(String[] args) {
        int a = 7;
        int d = 1;
        boolean[] included = { false, false, false, true, false, false, false };

        System.out.println(solution(a, d, included));
    }

    public static int solution(int a, int d, boolean[] included) {
        int len = included.length;
        int[] arithmetic = new int[len];
        arithmetic[0] = a;

        int answer = 0;
        for (int i = 1; i < len; i++) {
            arithmetic[i] = arithmetic[i - 1] + d;
        }

        for (int i = 0; i < len; i++) {
            if (included[i])
                answer += arithmetic[i];
        }

        return answer;
    }
}
