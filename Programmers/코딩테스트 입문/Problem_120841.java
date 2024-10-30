/**
 * Problem_120841
 */
public class Problem_120841 {

    public static void main(String[] args) {
        int []dot = {-7, 9};

        boolean isXPositive = dot[0] >= 0;
        boolean isYPositive = dot[1] >= 0;

        int answer = 0;
        if(!isXPositive && isYPositive) answer = 2;
        else if(!isXPositive && !isYPositive) answer = 3;
        else if(isXPositive && !isYPositive) answer = 4;
        else answer = 1;

        System.out.println(answer);
    }
}