public class Problem_120845 {

    public static void main(String[] args) {
        int []box = { 10, 8, 6 };
        int n = 3;

        int answer = 1;

        for(int i : box) {
            answer *= Math.floor(i / n);
        }

        System.out.println(answer);
    }
}