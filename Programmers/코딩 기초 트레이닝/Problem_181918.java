import java.util.Arrays;
import java.util.Stack;

/**
 * Problem_181918
 */
public class Problem_181918 {

    public static void main(String[] args) {
        
        int []arr = { 1, 4, 2, 5, 3 };

        //List<Integer> answer = new ArrayList<>();
        
        Stack<Integer> answer = new Stack<>();

        int i = 0;
        int length = arr.length;

        while (i<length) {
            if(answer.isEmpty()) {
                answer.add(arr[i++]);
                continue;
            }
            if(answer.peek() < arr[i]) {
                answer.add(arr[i++]);
                continue;
            }
            if(answer.peek() >= arr[i]) {
                answer.pop();
                continue;
            } 
            
        }

        System.out.println(Arrays.toString(answer.stream().mapToInt(Integer::intValue).toArray()));
    }
}