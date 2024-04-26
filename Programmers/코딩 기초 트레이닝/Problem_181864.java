
import java.util.Arrays;

public class Problem_181864 {

    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";

        char[] tmp = myString.toCharArray();

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 'A')
                tmp[i] = 'B';
            else
                tmp[i] = 'A';
        }

        String answer = Arrays.toString(tmp).replace("[", "").replaceAll(", ", "").replace("]", "");

        System.out.println(answer);
        System.out.println(answer.contains(pat) ? 1 : 0);
    }
}
