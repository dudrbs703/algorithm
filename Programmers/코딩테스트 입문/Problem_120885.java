/**
 * Problem_120885
 */
public class Problem_120885 {

    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";

        
        String answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
        System.out.println(answer);
    }
}