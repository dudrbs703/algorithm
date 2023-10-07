import java.util.Arrays;

public class Problem_181900 {
    
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int [] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };

        System.out.println(solution(my_string, indices));
    }

    public static String solution(String my_string, int []indices)
    {
        StringBuffer buffer = new StringBuffer();

        int []tmp = new int[my_string.length()];
        Arrays.fill(tmp, 0, my_string.length(), 1);

        for(int n : indices)
        {
            tmp[n] = 0;
        }

        for(int i=0; i<tmp.length; i++)
        {
            if(tmp[i] == 1) buffer.append(my_string.charAt(i));
        }


        return buffer.toString();
    }
}
