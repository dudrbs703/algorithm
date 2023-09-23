public class Problem_181932 {
    public static void main(String[] args) {

        String code = "abc1abc1abc";

        System.out.println(solution(code));
    }

    public static String solution(String code) {
        StringBuilder builder = new StringBuilder();
        int len = code.length();
        int mode = 0;

        for (int i = 0; i < len; i++) {
            char c = code.charAt(i);

            if (mode == 0) {
                if (Character.getNumericValue(c) != 1 && i % 2 == 0)
                    builder.append(c);
                if (Character.getNumericValue(c) == 1)
                    mode = 1;
                continue;
            }

            if (mode == 1) {
                if (Character.getNumericValue(c) != 1 && i % 2 != 0)
                    builder.append(c);
                if (Character.getNumericValue(c) == 1)
                    mode = 0;
                continue;
            }
        }

        return builder.length() == 0 ? "EMPTY" : builder.toString();
    }
}
