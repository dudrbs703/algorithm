import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem_181909
 */
public class Problem_181909 {

    public static void main(String[] args) {

        String my_string = "programmers";

        List<String> b = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            b.add(my_string.substring(i, my_string.length()));
        }

        Collections.sort(b);

        System.out.println(Arrays.toString(b.stream().toArray(String[]::new)));
    }
}