import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Problem_181902
 */
public class Problem_181902 {

    public static void main(String[] args) {

        String my_string = "Programmers";

        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            int position = 0;
            if (Character.isUpperCase(c))
                position = my_string.charAt(i) - 65;
            else
                position = (my_string.charAt(i) - 97) + 26;

            answer[position] += 1;

        }

        System.out.println(
                // A B C D E F G H I J K L N M O P Q R S T U V W X Y Z
                "정답 : [" +
                        "0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, " +
                        "1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]");
        System.out.println("제시 : " + Arrays.toString(answer));

    }
}