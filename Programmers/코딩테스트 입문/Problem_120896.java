import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem_120896
 */
public class Problem_120896 {

    public static void main(String[] args) {
        String s = "aaaaaaabccccddeff";
        String answer = "";

        char []tmp = s.toCharArray();
        Arrays.sort(tmp);

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : tmp)
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character key : map.keySet())
        {
            if(map.get(key) < 2) answer+=key;
        }

        System.out.println(answer);
    }
}