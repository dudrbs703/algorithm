/**
 * Problem_120891
 */
public class Problem_120891 {

    public static void main(String[] args) {
        int order = 29423;
        int answer = 0;
        char []tmp = String.valueOf(order).toCharArray();

        for(char c : tmp)
        {
            if(Character.getNumericValue(c) == 3 || Character.getNumericValue(c) == 6 || Character.getNumericValue(c) == 9)
            {
                answer++;
            }
        }

        System.out.println(answer);
    }
}