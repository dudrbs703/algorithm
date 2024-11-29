import java.util.Arrays;

/**
 * Problem_120889
 */
public class Problem_120889 {

    public static void main(String[] args) {
        int []sides = {199, 72, 222};

        Arrays.sort(sides);
        int max = sides[sides.length-1];
        int min = 0;

        for(int i=0; i<sides.length-1; i++)
        {
            min += sides[i];
        }

        int answer = max >= min ? 2 : 1;
        System.out.println(answer);
    }
}