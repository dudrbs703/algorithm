import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Problem_120888
 */
public class Problem_120888 {

    public static void main(String[] args) {
        String my_string = "We are the world";

        List<Character> list = new LinkedList<>();

        for(char c : my_string.toCharArray())
        {
            if(!list.contains(c)) list.add(c);
        }

        System.out.println(list.stream().map(c -> c.toString()).collect(Collectors.joining()).toString());
    }
}