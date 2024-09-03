import java.util.Arrays;

/**
 * Problem_181894
 */
public class Problem_181894 {

    public static void main(String[] args) {
        
        int []arr = { 1, 1, 1 };
        int []answer = { -1 };

        int start = -1;
        int end = -1;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }

        for(int i=arr.length-1; i>= 0; i--)
        {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }

        if(start != -1 ) answer = Arrays.copyOfRange(arr, start, end+1);
        else answer = new int[]{-1};

        System.out.println(start + " " + end );
        System.out.println(Arrays.toString(answer));
    }
}