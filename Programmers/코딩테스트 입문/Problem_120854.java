import java.util.Arrays;

/**
 * Problem_120854
 */
public class Problem_120854 {

    public static void main(String[] args) {
        String []strlist = { "We", "are", "the", "world!" };
        int []answer = new int[strlist.length];

        for(int i=0; i<strlist.length; i++)
        {
            answer[i] = strlist[i].length();
        }

        System.out.println(Arrays.toString(answer));
    }
}