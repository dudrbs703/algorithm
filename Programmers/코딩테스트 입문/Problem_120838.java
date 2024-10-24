import java.util.HashMap;
import java.util.Map;

/**
 * Problem_120838
 */
public class Problem_120838 {

    public static void main(String[] args) {
        
        String letter = ".... . .-.. .-.. ---";

        String []letters = letter.split(" ");
        Map<String, String> map = new HashMap<>();

        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f'," +
                        "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l'," +
                        "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r'," +
                        "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x'," +
                        "'-.--':'y','--..':'z'";

        String []morse2 = morse.split(",");

        for(String s : morse2)
        {
            s = s.replaceAll("\'", "");
            String []tmp = s.split(":");

            map.put(tmp[0], tmp[1]);
        }

        String answer = "";
        for(String s : letters)
        {
            answer += map.get(s);
        }

        System.out.println(answer);
                
    }
}