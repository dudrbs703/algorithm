public class Problem_181933 {

    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = false;

        System.out.println(solution(a, b, flag));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
