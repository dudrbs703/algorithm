import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1411
 */
public class Print_1411 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n[] = new int[a];

        for(int i = 1;i<n.length; i++)
        {
            int b = scanner.nextInt();
            n[b-1] = b;
        }
        scanner.close();

        for(int i =0;i<n.length; i++)
        {
            if(n[i] == 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}