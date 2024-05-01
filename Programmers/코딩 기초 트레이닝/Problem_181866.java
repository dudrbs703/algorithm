import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_181866 {
    public static void main(String[] args) {

        String myString = "axxbxx";
        String[] tmp = myString.split("x");

        List<String> answer = new ArrayList<>();
        for (String s : tmp) {
            if (!s.isEmpty() || !s.isBlank())
                answer.add(s);
        }

        Collections.sort(answer);
        System.out.println(answer);
    }
}
