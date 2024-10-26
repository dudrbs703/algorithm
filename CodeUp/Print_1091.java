import java.util.Scanner;

/**
 * Print_1091
 */
public class Print_1091 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long start = scanner.nextLong();
        int mutilply = scanner.nextInt();
        int add = scanner.nextInt();
        int position = scanner.nextInt();

        scanner.close();

        for(int i=1; i<position; i++)
        {
            //System.out.println(start);
            start*=mutilply;
            start+=add;
        }

        // 1 -2 1 8
        // -50 50 -50 10
        System.out.println(start);        
    }
}