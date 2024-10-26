import java.util.Scanner;

/**
 * Print_1090
 */
public class Print_1090 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long start = scanner.nextLong();
        int seq = scanner.nextInt();
        int position = scanner.nextInt();

        scanner.close();

        for(int i=1; i<position; i++)
        {
            //System.out.println(start);
            start*=seq;
        }

        // 2 3 7
        // 10 10 10
        System.out.println(start);        
    }
}