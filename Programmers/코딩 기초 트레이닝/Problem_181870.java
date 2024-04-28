import java.util.ArrayList;
import java.util.List;

/**
 * Problem_181870
 */
public class Problem_181870 {

    public static void main(String[] args) {
        String[] strArr = { "and", "notad", "abcd" };

        List<String> result = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad"))
                result.add(s);
        }

        System.out.println(result);
    }
}