import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem_120847
 */
public class Problem_120847 {

    public static void main(String[] args) {
        int []numbers = { 1, 2, 3, 4, 5 };

        int answer = 0;
        if(numbers.length == 1) answer = numbers[0];
        else if(numbers.length == 2) answer = numbers[0] * numbers[1];
        else {
            
            List<Integer> list = new ArrayList<>();
            for(int i : numbers) {
                list.add(i);
            }
            Collections.sort(list, Collections.reverseOrder());

            answer = list.get(0) * list.get(1);
        }

        System.out.println(answer);


    }
}