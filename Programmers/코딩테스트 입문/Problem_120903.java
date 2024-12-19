/**
 * Problem_120903
 */
public class Problem_120903 {

    public static void main(String[] args) {
        String []s1 = { "a", "b", "c" };
        String []s2 = { "com", "b", "d", "p", "c" };
        
        int answer = 0;

        for(String s : s1)
        {
            for(int i=0; i<s2.length; i++)
            {
                if(s.equals(s2[i])) answer++;
            }
        }

        System.out.println(answer);
    }
}