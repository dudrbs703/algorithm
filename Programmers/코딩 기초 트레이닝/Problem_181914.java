/**
 * Problem_181914
 */
public class Problem_181914 {

    public static void main(String[] args) {
        String number = "78720646226947352489";

        String []tmp = number.split("");

        int answer = 0;
        for(String s : tmp)
        {
            answer += Integer.parseInt(s);
        }

        System.out.println(answer % 9);
        
    }
}