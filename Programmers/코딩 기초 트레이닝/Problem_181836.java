import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem_181836
 */
public class Problem_181836 {


    public static void main(String[] args) {
                
        String []pictures = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        //String picture = ".xx...xx.";
        int k = 2;

        List<String> list = new ArrayList<>();

        String answer ="";
        for(String s : pictures)
        {
            String []tmp = s.split("");
            answer = "";
            for(int i=0; i<tmp.length; i++)
            {
                answer += tmp[i].repeat(k);
            }
            
            
            for(int i=0; i<k; i++)
            {
                list.add(answer);
            }
        }

        String []a = list.toArray(new String[list.size()]);

        for(String s : a)
        {
            System.out.println(s);
        }

    }
}