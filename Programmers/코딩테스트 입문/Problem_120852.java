import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_120852 {

    public static void main(String[] args) {
        int n = 420;

        Set<Integer> set = new HashSet<>();

        int tmp = 2;
        while (n != 1) {
            if(n % tmp == 0) {
                n /= tmp;
                set.add(tmp);
            }
            else tmp++;
        }
        int []answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        System.out.println(Arrays.toString(answer));
    }
}