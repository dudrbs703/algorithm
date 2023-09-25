public class Problem_181929 {
    public static void main(String[] args) {
        int[] num_list = { 5, 7, 8, 3 };

        System.out.println(solution(num_list));
    }

    public static int solution(int num_list[]) {
        int tmp1 = 0;
        int tmp2 = 1;
        for (int n : num_list) {
            tmp1 += n;
            tmp2 *= n;
        }
        tmp1 *= tmp1;

        return tmp1 > tmp2 ? 1 : 0;
    }
}
