import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Print_3002
 */
public class Print_3002 {

    static int []dataset;
    static int []query;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            map.put(i+1, scanner.nextInt());
        }

        n = scanner.nextInt();

        for(int i=0; i<n; i++)
        {
            int a = scanner.nextInt();
            if(!map.containsValue(a)) System.out.print("-1 ");
            else {
                for(Map.Entry<Integer, Integer> entry : map.entrySet())
                {
                    if(entry.getValue().equals(a)) System.out.print(entry.getKey()+" ");
                }
            }
        }*/

        data = new int[scanner.nextInt()];
        for(int i=0; i<data.length;i++)
        {
            data[i] = scanner.nextInt();
        }
        
        query = new int[scanner.nextInt()];
        for(int i=0; i<query.length;i++)
        {
            query[i] = scanner.nextInt();
            binary(0, query.length, query[i]);
            
        }
        scanner.close();
        
        
        //System.out.println(Arrays.binarySearch(data, query[1]));
    }
}