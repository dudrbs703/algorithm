/**
 * Problem_120818
 */
public class Problem_120818 {

    public static void main(String[] args) {
        int price = 100010;

        int answer = 0;

        if(500000 <= price) answer = price - (int)Math.ceil(price * 0.2);
        else if(300000 <= price) answer = price - (int)Math.ceil(price * 0.1);
        else if(100000 <= price) answer = price - (int)Math.ceil(price * 0.05);
        else answer = price;

        System.out.println(answer);
    }
}