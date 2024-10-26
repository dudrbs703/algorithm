/**
 * Problem_120909
 */
public class Problem_120909 {

    public static void main(String[] args) {
        int n = 976;

        int answer = 2;
        for(int i=1; i<=10000000; i++)
        {
            if(n == (int)Math.pow(i, 2)) 
            {
                answer = 1;
                break;
            }
        }

        System.out.println(answer);
    }
}