import java.util.HashMap;
import java.util.Map;

/**
 * Problem_120883
 */
public class Problem_120883 {

    public static void main(String[] args) {
        String []id_pw = {"meosseugi", "1234"};
        String [][]db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        Map<String, String> map = new HashMap<>();

        for(int i=0; i<db.length; i++)
        {
            String id = db[i][0];
            String pw = db[i][1];
            map.put(id, pw);
        }

        String answer = "";
        if(!map.containsKey(id_pw[0])) answer = "fail";
        else if(map.containsKey(id_pw[0]) && !map.get(id_pw[0]).equals(id_pw[1])) answer = "wrong pw"; 
        else answer = "login";

        System.out.println(answer);

    }
}