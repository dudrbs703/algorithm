public class Problem_120848 {

    public static void main(String[] args) {
        int n = 3628800;

        int answer = -1;
        int tmp = 1;

        for(int i=1; i<=10; i++)
        {
            tmp *= i;
            answer = i;
            if(tmp == n) break;
            if(tmp > n) break;
        }

        System.out.println(tmp > n ? --answer : answer);
    }
}