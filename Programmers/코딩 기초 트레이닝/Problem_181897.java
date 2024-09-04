import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem_181897
 */
public class Problem_181897 {

    public static void main(String[] args) {
        int []slicer = { 1, 5, 2};
        int []num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        int n = 4;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int []answer = null;
        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
            case 4:
                //int []tmp = Arrays.copyOfRange(num_list, a, b+1);
                List<Integer> list = new LinkedList<>();
                for(int i=a; i<=b; i+=c)
                {
                    list.add(num_list[i]);
                }
                answer = list.stream().mapToInt(Integer::intValue).toArray();
                break;
        
            default:
                answer = new int[0];
        }

        System.out.println(Arrays.toString(answer));
    }
}