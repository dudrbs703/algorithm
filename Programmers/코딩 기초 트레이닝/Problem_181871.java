/**
 * Problem_181871
 */
public class Problem_181871 {

    public static void main(String[] args) {
        String myString = "aaaa";
        String pat = "aa";


        int max = pat.length();
        int answer = 0;
        for(int i=0; i<myString.length()-pat.length()+1; i++)
        {
            String tmp = myString.substring(i, i+max);
            if(tmp.equals(pat))answer++;
        }

        System.out.println(answer);
    }
}