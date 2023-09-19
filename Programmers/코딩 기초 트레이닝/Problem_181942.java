import java.util.LinkedList;
import java.util.Queue;

public class Problem_181942 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println("result : " + solution(str1, str2));
    }

    public static String solution(String str1, String str2) {

        Queue<Character> tmp1 = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            tmp1.add(str1.charAt(i));
        }
        Queue<Character> tmp2 = new LinkedList<>();
        for (int i = 0; i < str2.length(); i++) {
            tmp2.add(str2.charAt(i));
        }

        StringBuilder builder = new StringBuilder();

        while (true) {
            if (!tmp1.isEmpty())
                builder.append(tmp1.poll());
            if (!tmp2.isEmpty())
                builder.append(tmp2.poll());
            if (tmp1.isEmpty() && tmp2.isEmpty())
                break;
        }

        return builder.toString();
    }
}
