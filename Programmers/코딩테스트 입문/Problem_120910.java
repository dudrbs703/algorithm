/**
 * Problem_120910
 */
public class Problem_120910 {

    public static void main(String[] args) {
        int n = 2;
        int t = 10;

        int answer = n;
        for(int i=1; i<=t; i++)
        {
            answer += answer;
        }

        System.out.println(answer);
    }
}