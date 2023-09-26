/**
 * Problem_181926
 */
class Problem_181926 {

    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(solution(n, control));
    }

    public static int solution(int n, String control) {
        int len = control.length();
        for (int i = 0; i < len; i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
                continue;
            }

            if (control.charAt(i) == 's') {
                n -= 1;
                continue;
            }
            if (control.charAt(i) == 'd') {
                n += 10;
                continue;
            }
            if (control.charAt(i) == 'a') {
                n -= 10;
                continue;
            }

        }
        return n;
    }

}