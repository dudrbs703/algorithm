import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem_181921 {
    
    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        System.out.println(Arrays.toString(solution(l, r)));
    }

    private static int[] solution(int l, int r)
    {
        int []answer = IntStream.rangeClosed(l, r).filter(n -> 
            !String.valueOf(n).contains("1") && 
            !String.valueOf(n).contains("2") &&
            !String.valueOf(n).contains("3") && 
            !String.valueOf(n).contains("4") &&
            !String.valueOf(n).contains("6") && 
            !String.valueOf(n).contains("7") && 
            !String.valueOf(n).contains("8") && 
            !String.valueOf(n).contains("9")
        ).filter(n -> String.valueOf(n).contains("5")).toArray();    

        return answer.length > 0 ? answer : new int[] { -1 };
    }
}
