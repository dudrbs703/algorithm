import java.util.Arrays;

/**
 * Problem_181890
 */
public class Problem_181890 {

    public static void main(String[] args) {
        String []str_list = { "l" };

        String []answer = {};
        for(int i=0; i<str_list.length; i++)
        {
            if(str_list[i].equals("l"))
            {
                answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            }

            if(str_list[i].equals("r"))
            {
                answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
                break;
            }
        }

        System.out.println(Arrays.toString(answer));
        
    }
}