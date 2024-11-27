/**
 * Problem_120887
 */
public class Problem_120887 {

    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;

        int answer = 0;

        for(int start = i; start<=j; start++)
        {
            String s = start+"";
            for(int a=0; a<s.length(); a++)
            {
                if(String.valueOf(s.charAt(a)).equals(String.valueOf(k)))
                    answer++;
            }
        }

        System.out.println(answer);
    }
}