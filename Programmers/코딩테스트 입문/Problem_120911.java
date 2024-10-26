import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem_120911
 */
public class Problem_120911 {

    public static void main(String[] args) {
        String my_string = "Bcad";

        String []tmp = my_string.toLowerCase().split("");

        List<String> list = new ArrayList<>(Arrays.asList(tmp));

        Collections.sort(list);

        System.out.println(String.join(",",list).replaceAll(",", ""));


    }
}