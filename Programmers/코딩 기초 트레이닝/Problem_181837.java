/**
 * Problem_181837
 */
public class Problem_181837 {

    public static void main(String[] args) {
        
        String []order = {
            "cafelatte", "americanoice", "hotcafelatte", "anything"
            //"americanoice", "americano", "iceamericano"
        };

        int answer = 0;
        for(String s : order)
        {
            System.out.println(s + " : "  +getPrice(s));
            answer += getPrice(s);
        }

        System.out.println(answer);
    }

    public static int getPrice(String menuName)
    {
        int price = 0;

        if(menuName.contains("americano") || menuName.equals("anything"))
        {
            return 4500;
        }

        if(menuName.contains("cafelatte"))
       {
            return 5000;
       }
        return price;
    }
}