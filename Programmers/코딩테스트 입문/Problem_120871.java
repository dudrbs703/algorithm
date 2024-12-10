public class Problem_120871 {

     public static void main(String[] args) {
        int n = 10;

        int answer = 0;

        while (n > 0) {
            answer++;
            if(answer % 3 == 0 || String.valueOf(answer).contains("3")) 
                continue;
 
            n--;
        }

        System.out.println(answer);
     }
}