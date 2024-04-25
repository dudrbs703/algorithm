public class Problem_181884 {

    public static void main(String[] args) {

        // int[] numbers = { 34, 5, 71, 29, 100, 34 };
        // int n = 123;

        int[] numbers = { 58, 44, 27, 10, 100 };
        int n = 139;

        int len = numbers.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            if (result <= n)
                result += numbers[i];
            else
                break;
        }

        System.out.println(result);
    }
}
