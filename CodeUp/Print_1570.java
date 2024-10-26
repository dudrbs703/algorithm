import java.util.Scanner;

/**
 * Print_1570
 */
public class Print_1570 {

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

        System.out.println(getLowerBound(data, b));
    }

    public static int getLowerBound(int []data, int b)
    {
        int tmp = 1;
        for(int i=0; i<data.length; i++)
        {
            if(data[i] < b) tmp++;
        }
        return tmp;
    }
}