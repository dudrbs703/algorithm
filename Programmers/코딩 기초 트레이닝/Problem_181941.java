public class Problem_181941 {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c" };

        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {
        StringBuilder builder = new StringBuilder();

        for (String s : arr) {
            builder.append(s);
        }
        return builder.toString();
    
    }
}
