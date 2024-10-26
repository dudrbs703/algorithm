import java.util.Arrays;

/**
 * Problem_120913
 */
public class Problem_120913 {

    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;
        String []answer = my_str.split("(?<=\\G.{"+n+"})");
        
        System.out.println(Arrays.toString(answer));
    }
}