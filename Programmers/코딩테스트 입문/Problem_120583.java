/**
 * Problem_120583
 */
public class Problem_120583 {

    public static void main(String[] args) {
        int []array = { 1, 1, 2, 3, 4, 5 };
        int n = 1;

        int answer = 0;

        for(int i : array)
        {
            if(n == i) answer++;
        }

        System.out.println(answer);
    }
}