/**
 * Problem_181872
 */
public class Problem_181872 {

    
    public static void main(String[] args) {
        String myString = "AAAAaaaa";
        String pat = "a";

        String answer = "";
        for(int i=myString.length()-1; i>= 0; i=--)
        {
            String s = myString.substring(0, i+1)
            if(s.endsWith(pat))
            {
                answer = s;
                break;
            }
        }

        System.out.println(answer);
        
    }
}