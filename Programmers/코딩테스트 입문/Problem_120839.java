/**
 * Problem_120839
 */
public class Problem_120839 {

    public static void main(String[] args) {
        String rsp = "205";
        String answer = "";

        int rock = 0;
        int paper = 5;
        int scissors = 2;

        for(char c : rsp.toCharArray())
        {
            if(Character.getNumericValue(c) == rock) answer += paper;
            if(Character.getNumericValue(c) == paper) answer += scissors;
            if(Character.getNumericValue(c) == scissors) answer += rock;
        }

        System.out.println(answer);
    }
}