public class Problem_181939 {
    public static void main(String[] args) {

        int a = 89;
        int b = 8;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(b);

        int tmp_1 = Integer.parseInt(builder.toString());

        builder.delete(0, builder.length());

        builder.append(b);
        builder.append(a);
        int tmp_2 = Integer.parseInt(builder.toString());

        return tmp_1 > tmp_2 ? tmp_1 : tmp_2;
    }
}
