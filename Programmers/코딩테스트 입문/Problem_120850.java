import java.util.Arrays;

/**
 * Problem_120850
 */
public class Problem_120850 {

    public static void main(String[] args) {
        
        String my_string = "hi12392";
        my_string = my_string.replaceAll("[a-zA-Z]", "");

        char []tmp = my_string.toCharArray();
        int []answer = new int[tmp.length];
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = Character.getNumericValue(tmp[i]);
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));

    }
}