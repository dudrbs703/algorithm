public class Problem_181930 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int b, int c) {

        int doubleSquare = 2;
        int tripleSquaure = 3;

        if ((a != b && b != c && a == c) || (a != b && b == c) || (a != c && a == b)) {
            int tmp1 = a + b + c;
            double tmp2 = Math.pow(a, doubleSquare) + Math.pow(b, doubleSquare) + Math.pow(c, doubleSquare);
            return (int) (tmp1 * tmp2);
        } else if (a == b && b == c && a == c) {
            int tmp1 = a + b + c;
            int tmp2 = (int) (Math.pow(a, doubleSquare) + Math.pow(b, doubleSquare) + Math.pow(c, doubleSquare));
            int tmp3 = (int) (Math.pow(a, tripleSquaure) + Math.pow(b, tripleSquaure) + Math.pow(c, tripleSquaure));
            return (int) (tmp1 * tmp2 * tmp3);
        } else
            return a + b + c;
    }
}
