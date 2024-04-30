import java.util.ArrayList;
import java.util.List;

public class Problem_181899 {
    public static void main(String[] args) {

        int start_num = 10;
        int end_num = 3;

        List<Integer> result = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            result.add(i);
        }

        System.out.println(result);
    }
}
