import java.util.ArrayList;
import java.util.List;

/**
 * Problem_120813
 */
public class Problem_120813 {

    public static void main(String[] args) {
        
        int n = 15;

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++)
        {
            if( i % 2 != 0) list.add(i);
        }
        
        System.out.println(list.stream().mapToInt(Integer::intValue).toArray());
    }
}