import java.util.HashMap;
import java.util.Map;

/**
 * Problem_181855
 */
public class Problem_181855 {

    public static void main(String[] args) {
        
        String []strArr = {
            "a","bc","d","efg","hi"
        };

        Map<Integer, Integer> tmp = new HashMap<>();
        for(String s : strArr)
        {
            tmp.put(s.length(), tmp.getOrDefault(s.length(), 0) + 1);
        }

        int answer = 0;
        for(Integer key: tmp.keySet())
        {
            answer = Math.max(answer, tmp.get(key));
        }
        System.out.println(answer);
    }
}