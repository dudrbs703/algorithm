/**
 * Problem_181903
 */
public class Problem_181903 {

    public static void main(String[] args) {
        int q  = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";

        System.out.println(solution(q, r, code));
    }

    public static String solution(int q, int r, String code)
    {
        StringBuffer buffer = new StringBuffer();

        int len = code.length();

        for(int i=0; i<len; i++)
        {
            if( i % q == r) buffer.append(code.charAt(i));
        }

        return buffer.toString();
    }
}