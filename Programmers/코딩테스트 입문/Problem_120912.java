/**
 * Problem_120912
 */
public class Problem_120912 {

    public static void main(String[] args) {
        int []array = { 7, 77, 17 };

        int answer = 0;

        for(int i : array)
        {
            String s = i+"";
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j) == '7') answer++;
            }
        }

        System.out.println(answer);
    }
}