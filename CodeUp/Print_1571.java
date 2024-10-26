import java.util.Scanner;

/**
 * Print_1571
 */
public class Print_1571 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []data = new int[a];
        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println(getUpperBound(data, b));
    }

    public static int getUpperBound(int []data, int b)
    {
        for(int i=0; i<data.length; i++)
        {
            if(data[i] > b) return i + 1;
        }
        return data.length + 1;
    }
}