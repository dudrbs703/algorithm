
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem_181885 {
    public static void main(String[] args) {

        String[] todo_list = { "problemsolving", "practiceguitar", "swim", "studygraph" };
        boolean[] finished = { true, false, true, false };

        List<String> result = new LinkedList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i])
                result.add(todo_list[i]);
        }

        System.out.println(Arrays.toString(result.stream().toArray()));
    }
}