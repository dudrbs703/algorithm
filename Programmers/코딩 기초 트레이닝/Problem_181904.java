public class Problem_181904 {

    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        System.out.println(solution(my_string, m, c));
    }

    public static String solution(String my_string, int m, int c) {

        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            builder.append(my_string.charAt(i));
            count++;

            if (count == m) {
                buffer.append(builder.toString().charAt(c - 1));
                builder.delete(0, m);
                count = 0;
            }
        }

        return buffer.toString();
    }
}
