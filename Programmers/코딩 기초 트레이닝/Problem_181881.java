import java.util.Arrays;

/**
 * Problem_181881
 */
public class Problem_181881 {

    public static void main(String[] args) {
        int []arr = { 1, 2, 3, 100, 99, 98 };
        int []answer = Arrays.copyOf(arr, arr.length);

        int count = 0;

        while (true) {

            for(int i=0; i<arr.length; i++)
            {
                int n = arr[i];
                if(n >= 50 && n % 2 == 0) {
                    arr[i] /= 2;
                    continue;
                }
                if(n < 50 && n % 2 != 0){
                    arr[i] = (arr[i] * 2) + 1;
                    continue;
                }
            }

            if(Arrays.equals(arr, answer)) break;

            answer = Arrays.copyOf(arr, arr.length);

            count++;            
        }

        System.out. println(count);
    }
}