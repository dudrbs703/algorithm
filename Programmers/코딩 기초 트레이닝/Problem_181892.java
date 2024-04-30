import java.util.Arrays;

public class Problem_181892 {

    public static void main(String[] args) {

        int[] num_list = { 2, 1, 6 };
        int n = 3;

        System.out.println(Arrays.toString(Arrays.copyOfRange(num_list, n - 1, num_list.length)));
    }
}
