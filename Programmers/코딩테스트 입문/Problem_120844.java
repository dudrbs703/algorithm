import java.util.Arrays;

/**
 * Problem_120844
 */
public class Problem_120844 {

    public static void main(String[] args) {
        int []numbers = { 1, 2, 3 };
        String direction = "right";

        int []answer = new int[numbers.length];

        if(direction.equals("left"))
        {
            int tmp = numbers[0];
            for(int i=0;i<answer.length-1; i++)
            {
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = tmp;
        }
        if(direction.equals("right"))
        {
            int tmp = numbers[numbers.length-1];
            for(int i=1;i<answer.length; i++)
            {
                answer[i] = numbers[i-1];
            }
            answer[0] = tmp;
        }

        System.out.println(Arrays.toString(answer));
    }
}