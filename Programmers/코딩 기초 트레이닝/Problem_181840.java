public class Problem_181840 {
    public static void main(String[] args) {
        int[] num_list = { 1, 2, 3, 4, 5 };
        int n = 3;

        boolean isContained = false;
        for (int i : num_list) {
            if (i == n)
                isContained = true;
        }

        System.out.println(isContained);
    }
}
