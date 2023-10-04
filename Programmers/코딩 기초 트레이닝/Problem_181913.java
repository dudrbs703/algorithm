
class Problem_181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };

        System.err.println(solution(my_string, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        int len = queries.length;
        StringBuilder buffer = new StringBuilder(my_string);

        for (int i = 0; i < len; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            StringBuilder builder = new StringBuilder(buffer.substring(from, to + 1));
            builder.reverse();
            buffer.replace(from, to + 1, builder.toString());

        }

        return buffer.toString();
    }
}
