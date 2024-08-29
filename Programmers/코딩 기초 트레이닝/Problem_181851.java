/**
 * Problem_181851
 */

public class Problem_181851 {

    
    public static void main(String[] args) {
        int []rank  = {3, 7, 2, 5, 4, 6, 1};
        boolean []attendance = { false, true, true, true, true, false, false };

        int answer = 0;
       
        for(int i=1; i<=3; i++)
        {
            int max = Integer.MAX_VALUE;
            int idx = -1;
            
            for(int j=0; j<rank.length; j++)
            {
                if(attendance[j] && max > rank[j])
                {
                    idx = j;
                    max = rank[j];
                }
            }

            attendance[idx] = false;

            if(i == 1) answer += 10000 * idx;
            else if(i == 2) answer += 100 * idx;
            else if(i == 3) answer += idx;
        }

        System.out.println(answer);
    }
}