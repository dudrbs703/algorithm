public class Problem_181938 {
    public static void main(String[] args) {

        int a = 91;
        int b = 2;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(b);
        int tmp1 = Integer.parseInt(builder.toString());
        int tmp2 = 2 * a * b;

        if (tmp2 > tmp1)
            return tmp2;
        else
            return tmp1;
    }
}
