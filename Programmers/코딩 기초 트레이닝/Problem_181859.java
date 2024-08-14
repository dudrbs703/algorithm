import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Problem_181859
 */
public class Problem_181859 {

    public static void main(String[] args) {
        //int []arr = { 0, 1, 1, 1, 0 };
        //int []arr = { 0, 1, 0, 1, 0 };
        int []arr = { 0, 1, 1, 0 };


        Deque<Integer> answer = new ArrayDeque<>();

        int i = 0;
        int length = arr.length;

        while (i<length) {
            if(answer.isEmpty()) {
                answer.offerFirst(arr[i++]);
                continue;
            }
            if(answer.peek() == arr[i]) {
                answer.pollFirst();
                i++;
                continue;
            }
            if(answer.peek() != arr[i]) {
                answer.offerFirst(arr[i++]);
                continue;
            } 
            
        }

        if(answer.isEmpty()) answer.offerFirst(-1);

        System.out.println(Arrays.toString(answer.stream().mapToInt(Integer::intValue).toArray()));
    }
}