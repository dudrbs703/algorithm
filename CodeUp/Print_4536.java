import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Print_4536
 */
public class Print_4536 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp = 0;
        int []data = new int[10];

        Map<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<10; i++)
        {
            tmp += data[i] = scanner.nextInt();
            hashMap.put(String.valueOf(data[i]), hashMap.getOrDefault(String.valueOf(data[i]), 0)+1);
        }
        scanner.close();
        Arrays.sort(data);

        int max = 0;
        int max_tmp = 0;
        for(Map.Entry<String, Integer> entry : hashMap.entrySet())
        {
            if(entry.getValue().intValue() > max_tmp)
            {
                max = Integer.parseInt(entry.getKey());
                max_tmp = entry.getValue();
            }
        }
        
        System.out.println(tmp/10);
        System.out.println(max);
    }
}