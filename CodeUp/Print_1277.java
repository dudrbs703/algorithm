import java.util.Scanner;

/**
 * Print_1277
 */
public class Print_1277 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = new int[scanner.nextInt()];
        int len = array.length;
        int mid = array.length / 2;

        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(array[0]+" "+array[mid]+" "+array[len-1]);
    }
}