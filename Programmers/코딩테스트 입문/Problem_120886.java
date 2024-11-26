/**
 * Problem_120886
 */
public class Problem_120886 {

    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

        System.out.println(new StringBuilder(before).reverse().toString().equals(after) ? 1 : 0);
    }
}