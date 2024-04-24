import java.util.Arrays;

public class Problem_181854 {
    public static void main(String[] args) {

        int[] arr = { 49, 12, 100, 276, 33 };
        // int[] arr = { 444, 555, 666, 777 };
        int n = 27;

        boolean isEven = arr.length % 2 == 0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven && (i + 1) % 2 == 0)
                arr[i] += n;
            if (!isEven && (i + 1) % 2 != 0)
                arr[i] += n;
        }

        System.out.println(Arrays.toString(arr));
    }
}
