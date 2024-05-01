public class Problem_181865 {

    public static void main(String[] args) {

        String binomial = "0 - 7777";
        binomial = binomial.replaceAll(" ", "");

        int a, b;

        String[] tmp;
        if (binomial.contains("+")) {
            tmp = binomial.split("\\+");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            System.out.println(a + b);
        } else if (binomial.contains("-")) {
            tmp = binomial.split("\\-");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            System.out.println(a - b);
        } else {
            tmp = binomial.split("\\*");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            System.out.println(a * b);
        }

    }
}
