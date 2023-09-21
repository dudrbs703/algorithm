public class Problem_181934 {
    public static void main(String[] args) {
        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;

        System.out.println(solution(ineq, eq, n, m));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m)
                return 1;
            else
                return 0;
        }

        if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m)
                return 1;
            else
                return 0;
        }

        if (ineq.equals("<") && eq.equals("!")) {
            if (n < m)
                return 1;
            else
                return 0;
        }

        if (ineq.equals(">") && eq.equals("!")) {
            if (n > m)
                return 1;
            else
                return 0;
        }

        return 0;
    }
}
