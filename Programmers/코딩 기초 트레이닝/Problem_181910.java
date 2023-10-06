public class Problem_181910 {

    public static void main(String[] args) {

        String my_string = "ProgrammerS123";
        int n = 11;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        StringBuilder builder = new StringBuilder(my_string);

        int len = my_string.length();

        return builder.substring(len - n, len);
    }
}
