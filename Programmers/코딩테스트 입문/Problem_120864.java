/**
 * Problem_120864
 */
public class Problem_120864 {

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");

        
        for(String s : my_string.split(" "))
        {
            if(!s.isBlank())  answer+= Integer.parseInt(s);
        }

        System.out.println(answer);
        
    }
}