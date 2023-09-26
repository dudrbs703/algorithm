public class Problem_181925 {
    public static void main(String[] args) {
        int[] numLog = { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 };

        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {

        int len = numLog.length;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < len; i++) {
            if (numLog[i] - numLog[i - 1] == 1) {
                builder.append("w");
                continue;
            }
            if (numLog[i] - numLog[i - 1] == -1) {
                builder.append("s");
                continue;
            }
            if (numLog[i] - numLog[i - 1] == 10) {
                builder.append("d");
                continue;
            }
            if (numLog[i] - numLog[i - 1] == -10) {
                builder.append("a");
                continue;
            }
        }
        return builder.toString();
    }
}
