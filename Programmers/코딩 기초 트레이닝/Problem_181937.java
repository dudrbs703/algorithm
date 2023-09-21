public class Problem_181937 {
    public static void main(String[] args) {
        int num = 34;
        int n = 3;

        System.out.println(solution(num, n));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
