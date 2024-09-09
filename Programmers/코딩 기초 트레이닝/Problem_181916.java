import java.util.stream.IntStream;

/**
 * Problem_181916
 */
public class Problem_181916 {

    public static void main(String[] args) {

        int answer = 0;
        int a = 5;
        int b = 4;
        int c = 6;
        int d = 6;

        int []arr = {a, b, c, d};
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr)
        {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        int tmp = 0;
        //1
        if(a == b && b == c && c == d && a == d) answer += 1111*a;
        
        //2
        else if(a != b && a == c && a == d)
        {
            answer = (10*a+b);
            answer = answer * answer;
        } 
        else if(a == b && a != c && a == d){
            answer = (10*a+c);
            answer = answer * answer;
        }
        else if(a == b && a == c && a != d){
            answer = (10*a+d);
            answer = answer * answer;
        }
        
        else if(b != a && b == c && b == d){
            answer = (10*b+a);
            answer = answer * answer;
        }
        else if(b == a && b != c && b == d){
            answer = (10*b+c);
            answer = answer * answer;
        }
        else if(b == a && b == c && b != d){
            answer = (10*b+d);
            answer = answer * answer;
        }
        
        else if(c != a && c == b && c == d){
            answer = (10*c+a);
            answer = answer * answer;
        }
        else if(c == a && c != b && c == d){
            answer = (10*c+b);
            answer = answer * answer;
        }
        else if(c == a && c == b && c != d){
            answer = (10*c+d);
            answer = answer * answer;
        }
        
        else if(d != a && d == b && d == c){
            answer = (10*d+a);
            answer = answer * answer;
        }
        else if(d == a && d != b && d == c){
            answer = (10*d+b);
            answer = answer * answer;
        }
        else if(d == a && d == b && d != c){
            answer = (10*d+c);
            answer = answer * answer;
        }
        
        //3
        else if(a == b && c == d) {

            if(b < d) {
                tmp = b;
                b = d;
                d = tmp;
            }
            answer = (a + c) * (b - d);
        }
        
        else if(a == c && b == d) {
            if(c < d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            answer = (a + b) * (c - d);
        }
        else if(a == d && b == c) {
            if(c < d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            answer = (a + b) * (c - d);
        }

        //4
        else if(a == b && c != d) answer += c * d;
        else if(a == c && b != d) answer += b * d;
        else if(a == d && c != b) answer += c * b;
        else if(a != b && c == d) answer += a * b;
        else if(a != c && b == d) answer += a * c;
        else if(a != d && c == b) answer += a * d;

        //5
        else if(a != b && a != c && a != d && b != c && b != d && c != d) answer +=  min;

        

        System.out.println(answer);
    }
}