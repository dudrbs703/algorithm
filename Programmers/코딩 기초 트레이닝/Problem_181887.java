public class Problem_181887 {
    public static void main(String[] args) {

        int[] num_list = { 4, 2, 6, 1, 7, 6 };

        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0)
                even += num_list[i];
            else
                odd += num_list[i];
        }

        System.out.println(Math.max(even, odd));

    }
}
