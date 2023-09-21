public class Problem_181936 {
    public static void main(String[] args) {
        int number = 55;
        int n = 10;
        int m = 5;

        System.out.println(solution(number, n, m));
    }

    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
