import java.util.Arrays;
import java.util.Scanner;

/**
 * Print_1551
 */
public class Print_1551 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []data = new int[scanner.nextInt()];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }

        System.out.println(indexOf(data, scanner.nextInt()));
        scanner.close();
    }

    public static int indexOf(int []data, int item)
    {
        int answer = 0;
        for(int i=0; i<data.length; i++)
        {
            if(data[i] == item) 
            {
                answer = i+1;
                break;
            }
        }

        return answer == 0 ? -1 : answer;
    }
}