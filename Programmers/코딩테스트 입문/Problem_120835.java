import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem_120835
 */
public class Problem_120835 {

    public static void main(String[] args) {
        int []emergency = { 30, 10, 23, 6, 100 };

        int []rank = new int[emergency.length];

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(emergency).forEach(i -> map.put(i, 0));
        rank = Arrays.stream(emergency).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int tmp = 0;
        for(int i : rank) {
            map.put(i, ++tmp);
        }

        int []answer = new int[emergency.length];
        tmp = 0;
        for(int i : emergency) {
            answer[tmp++] = map.get(i).intValue();
        }

        System.out.println(Arrays.toString(answer));
    }
}