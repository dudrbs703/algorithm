public class Problem_181911 {
    public static void main(String[] args) {
        String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
        int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };

        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuffer buffer = new StringBuffer();

        int position = 0;
        for (String tmp : my_strings) {
            int from = parts[position][0];
            int to = parts[position++][1] + 1;
            buffer.append(tmp.substring(from, to));
        }

        return buffer.toString();
    }
}
