import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_181868 {

    public static void main(String[] args) {

        String my_string = "i    love  you";

        String[] a = my_string.split(" ");

        List<String> tmp = new ArrayList<>();
        for (String s : a) {
            if (!s.isBlank())
                tmp.add(s);
        }

        System.out.println(Arrays.toString(tmp.stream().toArray(String[]::new)));
    }
}
