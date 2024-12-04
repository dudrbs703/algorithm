/**
 * Problem_120892
 */
public class Problem_120892 {

    public static void main(String[] args) {
        String cipher = "pfqallllabwaoclk";
        String answer = "";

        int code = 2;
        for(int i=code-1; i<cipher.length(); i+=code)
        {
            answer += cipher.charAt(i);
        }

        System.out.println(answer);
    }
}