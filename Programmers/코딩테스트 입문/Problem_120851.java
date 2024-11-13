/**
 * Problem_120851
 */
public class Problem_120851 {

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");

        for(int i=0; i<my_string.length(); i++)
        {
            answer += Character.getNumericValue(my_string.charAt(i));
        }

        System.out.println(answer);
    }
}