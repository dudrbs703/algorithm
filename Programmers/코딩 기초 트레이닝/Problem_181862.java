import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem_181862
 */
public class Problem_181862 {

    public static void main(String[] args) {
        String myStr = "cabab";

        List<String> tmp = new ArrayList<>();

        String after = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ");

        String a[] = after.split(" ");

        for(String s : a)
        {
            if(!s.isEmpty() || !s.isBlank()) tmp.add(s);
        }

        //System.out.println(Arrays.toString(a));
        String []answer = tmp.toArray(String[]::new);

        if(answer.length > 0) System.out.println(Arrays.toString(answer));
        else System.out.println("EMPTY");
    }
}