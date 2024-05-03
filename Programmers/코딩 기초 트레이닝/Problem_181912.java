import java.util.ArrayList;
import java.util.List;

public class Problem_181912 {
    public static void main(String[] args) {

        String[] intStrs = { "0123456789", "9876543210", "9999999999999" };
        int k = 50000;
        int s = 5;
        int l = 5;

        List<Integer> answer = new ArrayList<>();

        for (String tmp : intStrs) {
            int i = Integer.parseInt(tmp.substring(s, s + l));

            if (i > k)
                answer.add(i);
        }

        System.out.println(answer);
    }
}
