import java.util.Scanner;

/**
 * Print_1089
 */
public class Print_1089 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int seq = scanner.nextInt();
        int position = scanner.nextInt();

        scanner.close();

        for(int i=1; i<position; i++)
        {
            //System.out.println(start);
            start+=seq;
        }

        System.out.println(start);        
    }
}