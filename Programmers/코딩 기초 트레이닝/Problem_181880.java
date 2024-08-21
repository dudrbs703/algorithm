/**
 * Problem_181880
 */
public class Problem_181880 {

    public static void main(String[] args) {
        
        int []num_list = { 12, 4, 15, 1, 14 };
        int answer = 0;

        for(int n : num_list)
        {
            while (n != 1) {
                if(n % 2 == 0) n/= 2;
                else n = (n - 1) / 2;

                answer++;
            }
        }

        System.out.println(answer);

    }
}