
/**
 * Problem_120853
 */
public class Problem_120853 {

    public static void main(String[] args) {
        String s = "-1 -2 -3 Z";
        int answer = 0;      

        String []array = s.split(" ");
        int tmp = 0;
        for(String ar : array) {
            if(!ar.equals("Z")) {
                tmp = Integer.parseInt(ar);
                answer += Integer.parseInt(ar);
            }
            else {
                answer -= tmp;
            }
        }

        System.out.println(answer);
    }
}