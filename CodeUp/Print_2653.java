import java.util.Scanner;

/**
 * Print_2653
 */
public class Print_2653 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for(int i=0;;i++)
        {
            if(Integer.toBinaryString(i).length() > n) break;
            else {
                String tmp = Integer.toBinaryString(i);

                for(int j=0; j<n-tmp.length(); j++)
                {
                    builder.append("0");
                }
                builder.append(tmp);

                String result = builder.toString();
                builder.delete(0, builder.length());
                //builder = new StringBuilder();
                
                boolean isDuplicated = false;
                for(int j=0; j<result.length()-1; j++)
                {
                    if(result.charAt(j) == '0' && result.charAt(j+1) == '0') isDuplicated = true;
                    if(isDuplicated) break;
                }

                if(!isDuplicated) count++;
            }
        }

        System.out.println(count);
    }
}