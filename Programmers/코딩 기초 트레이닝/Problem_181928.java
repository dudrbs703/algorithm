public class Problem_181928 {
    public static void main(String[] args) {
        int[] num_list = { 3, 4, 5, 2, 1 };

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int n : num_list) {
            if (n % 2 == 0)
                even += "" + n;
            else
                odd += "" + n;
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
