public class Problem_181940 {

    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;

        System.out.println(solution(my_string, k));
    }

    public static String solution(String my_string, int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            builder.append(my_string);
        }
        return builder.toString();
    }
}
