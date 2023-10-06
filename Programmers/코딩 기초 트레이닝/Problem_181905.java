public class Problem_181905 {

    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

        System.out.println(solution(my_string, s, e));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder builder = new StringBuilder(my_string.subSequence(s, e + 1));
        String before = builder.toString();
        builder.reverse();

        my_string = my_string.replace(before, builder.toString());

        return my_string;
    }
}
