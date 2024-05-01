import java.math.BigInteger;

public class Problem_181846 {

    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        System.out.println(a1.add(b1).toString());
    }
}
