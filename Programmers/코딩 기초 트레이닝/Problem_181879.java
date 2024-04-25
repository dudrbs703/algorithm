public class Problem_181879 {
    public static void main(String[] args) {
        int[] num_list = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };

        int result = 0;
        if (num_list.length >= 11) {
            for (int i : num_list) {
                result += i;
            }
        } else {
            result = 1;
            for (int i : num_list) {
                result *= i;
            }
        }

        System.out.println(result);
    }
}
