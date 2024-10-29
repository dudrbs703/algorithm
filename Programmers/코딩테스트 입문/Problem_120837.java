/**
 * Problem_120837
 */
public class Problem_120837 {

    public static void main(String[] args) {
        int hp = 999;

        int answer = 0;

        while (hp != 0) {
            if(hp >= 5) {
               answer += hp / 5;
               hp %= 5;
            }

            if(hp >= 3) {
                answer += hp / 3;
                hp %= 3;
             }

             if(hp >= 1) {
                answer += hp / 1;
                hp %= 1;
             }
        }

        System.out.println(answer);


    }
}