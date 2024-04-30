import java.util.ArrayList;
import java.util.List;

public class Problem_181891 {

    public static void main(String[] args) {

        int[] num_list = { 2, 1, 6 };
        int n = 1;

        List<Integer> tmp = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            tmp.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            tmp.add(num_list[i]);
        }

        System.out.println(tmp);

    }
}
