/**
 * Problem_120831
 */
public class Problem_120831 {

    public static void main(String[] args) {
        
        int n = 10;

        int tmp = 0;
        
        for(int i=1; i<=n; i++)
        {
            if(i % 2 == 0) tmp+=i;
        }

        System.out.println(tmp);
    }
}