
public class Problem_181943 {
    public static void main(String[] args) {

        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        System.out.println(solution(my_string, overwrite_string, s));
    }

    public static String solution(String my_string, String overwrite_string, int s) {

        StringBuilder builder = new StringBuilder();
        builder.append(my_string.substring(0, s));
        builder.append(overwrite_string);
        builder.append(my_string.substring(s + overwrite_string.length(), my_string.length()));

        return builder.toString();
    }
}
