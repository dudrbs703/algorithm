/**
 * Problem_120836
 */
public class Problem_120836 {

    public static void main(String[] args) {
        int n = 100;

        int answer = 0;

        for(int i=1; i<=n; i++)
        {
            if(n % i == 0) answer++;
        }

        System.out.println(answer);
    }
}