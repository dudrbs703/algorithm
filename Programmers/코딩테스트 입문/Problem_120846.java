/**
 * Problem_120846
 */
public class Problem_120846 {

    public static void main(String[] args) {
        int n = 15;

        int count = 0;
        int answer = 0;

        for(int i=4; i<=n; i++)
        {
            System.out.print(i+":");
            for(int j=1; j<=i; j++)
            {
                if( i % j == 0)  count++;
            }

            if(count >= 3)  answer++;
            
            count = 0;
        }

        System.out.println(answer);
    }
}