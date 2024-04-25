import java.util.Arrays;

public class Problem_181882 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 100, 99, 98 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0)
                arr[i] /= 2;
            else if (arr[i] < 50 && arr[i] % 2 != 0)
                arr[i] *= 2;
            else
                continue;

        }

        System.out.println(Arrays.toString(arr));
    }
}
