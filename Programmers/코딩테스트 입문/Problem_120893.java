/**
 * Problem_120893
 */
public class Problem_120893 {

    public static void main(String[] args) {
        String my_string = "abCdEfghIJ";

        StringBuffer buffer = new StringBuffer();

        for(Character c : my_string.toCharArray())
        {
            if(Character.isLowerCase(c)) buffer.append(Character.toUpperCase(c));
            else buffer.append(Character.toLowerCase(c));
        }

        System.out.println(buffer.toString());
        
    }
}