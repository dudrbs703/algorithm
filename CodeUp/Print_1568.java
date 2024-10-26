import java.util.Scanner;

/**
 * Print_1568
 */
public class Print_1568 {

    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        int []data = new int[scanner.nextInt()+1];
        
        for(int i=1; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();

        System.out.println(getRangeMaxPosition(data, start, end));
    }

    public static int getRangeMaxPosition(int []data, int start, int end)
    {
        int max = data[start];
        int index = start;

        for(int i=start; i<=end; i++)
        {
            if(data[i] > max)
            {
                max = data[i];
                index = i;
            }
        }

        return index;
    }
}