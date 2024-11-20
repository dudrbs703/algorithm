import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * Problem_120862
 */
public class Problem_120862 {

    public static void main(String[] args) {
        int []numbers = {0, 1, 2, -1, -2};

        int answer = 0;

        if(numbers.length == 2) answer = numbers[0] * numbers[1];
        else {
            List<Integer> q = new LinkedList<>();
            List<Integer> q2 = new LinkedList<>();

            for(int i : numbers)
            {
                if(i >= 0) q.add(i);
                else q2.add(i);
            }

            Collections.sort(q, Collections.reverseOrder());
            Collections.sort(q2, Collections.reverseOrder());

            int tmp1 = 0;
            int tmp2 = 0;
            if(q.size() >= 2 && q2.size() >= 2)
            {
                tmp1 = q.get(0) * q.get(1);
                tmp2 = q2.get(0) * q2.get(1);
                if(tmp1 > tmp2) answer = tmp1;
                else answer = tmp2;
            } 
            else if(q.size() >= 2) {
                tmp1 = q.get(0) * q.get(1);
                answer = tmp1;
            }
            else if(q2.size() >= 2) {
                tmp2 = q2.get(0) * q2.get(1);
                answer = tmp2;
            }
        }
        System.out.println(answer);
    }
}