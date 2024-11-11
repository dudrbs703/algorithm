import java.util.HashMap;
import java.util.Map;

public class Problem_120834 {

    public static void main(String[] args) {
        int age = 100;
        String answer = "";

        Map<Integer, Character> map = new HashMap<>();

        for(int i=0; i<=9; i++)
        {
            map.put(i, (char)('a'+i));
        }

        char []arr = String.valueOf(age).toCharArray();

        for(char c : arr) {
            answer += map.get(Character.getNumericValue(c));
        }

        System.out.println(answer);
    }
}