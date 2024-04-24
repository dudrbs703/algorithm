public class Problem_181856 {
    public static void main(String[] args) {

        int[] arr1 = { 49, 13 };
        int[] arr2 = { 70, 11, 2 };

        int arr1_len = arr1.length;
        int arr2_len = arr2.length;

        int t1 = 0;
        int t2 = 0;

        for (int i : arr1) {
            t1 += i;
        }
        for (int i : arr2) {
            t2 += i;
        }

        if (arr1_len > arr2_len || arr1_len == arr2_len && t1 > t2)
            System.out.print(1);
        else if (arr1_len < arr2_len || arr1_len == arr2_len && t1 < t2)
            System.out.print(-1);
        else
            System.out.print(0);

    }
}
