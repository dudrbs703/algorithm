import java.util.Arrays;

/**
 * Problem_120819
 */
public class Problem_120819 {

    public static void main(String[] args) {
        int money = 15000;
        int americano = 5500;
        int []answer = {
            money / americano,
            money % americano,
        };

        System.out.println(Arrays.toString(answer));
        //System.out.println(count);
        //System.out.println(money);

    }
}