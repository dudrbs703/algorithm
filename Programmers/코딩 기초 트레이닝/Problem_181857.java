import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem_181857
 */
public class Problem_181857 {

    public static void main(String[] args) {
        int []arr = { 58, 172, 746, 89 };

        List<Integer> answer = new ArrayList<>();

        for(int i : arr)
        {
            answer.add(i);
        }

        int exp = 1;
        int count = 1;
        while (answer.size() > exp) {

            exp = (int)Math.pow(2, count++);
        }

        for(int i=answer.size(); i<exp; i++)
        {
            answer.add(0);
        }

        System.out.println(Arrays.toString(answer.stream().mapToInt(Integer::intValue).toArray()));
    }
}