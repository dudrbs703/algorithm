/**
 * Problem_120895
 */
public class Problem_120895 {

    public static void main(String[] args) {

        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        char []tmp = my_string.toCharArray();
        char c = tmp[num1];
        tmp[num1] = tmp[num2];
        tmp[num2] = c;

        
        String answer = String.valueOf(tmp);
        System.out.println(answer);
    }
}