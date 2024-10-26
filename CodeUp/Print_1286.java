import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1286
 */
public class Print_1286 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int size = array.length;
        for(int i=1; i<=array.length;i++)
        {
            for(int j=0; j<array.length-i; j++)
            {
                if(array[j] >= array[j+1])
                {
                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }

        System.out.println(array[size-1]);
        System.out.println(array[0]);
    }
}