public class Problem_181839 {
    public static void main(String[] args) {

        int a = 6;
        int b = 1;

        if (a % 2 != 0 && a % 2 != 0)
            System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
        else if (a % 2 != 0 || a % 2 != 0)
            System.out.println(Math.abs(a - b));
        else
            System.out.println(2 * (a + b));

    }
}
