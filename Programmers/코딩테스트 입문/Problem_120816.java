/**
 * Problem_120816
 */
public class Problem_120816 {

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;

        System.out.println(n % slice == 0 ? n / slice : (n/slice)+1);
    }
}