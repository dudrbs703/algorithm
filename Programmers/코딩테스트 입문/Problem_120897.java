import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem_120897
 */
public class Problem_120897 {

    public static void main(String[] args) {
        
        int n = 24;

        List<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; i++)
        {
            if(n % i == 0) list.add(i);
        }

        int []answer = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }
}