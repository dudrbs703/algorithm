/**
 * Problem_181898
 */
public class Problem_181898 {

    public static void main(String[] args) {
        
        int []arr = {1, 1, 1, 1, 0};
        int idx = 4;
        int answer = -1;

        for(int i=idx; i<arr.length; i++)
        {
            if(i >= idx && arr[i] == 1)
            {
                answer = i;
                break;
            }

        }


        System.out.println(answer);
    }
}