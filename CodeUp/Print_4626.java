import java.util.Scanner;

/**
 * Print_4626
 */
public class Print_4626 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int []data = new int[a];
        int []score = new int[a];

        for(int i=0; i<data.length; i++)
        {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        int count = 0;
        if(data[0] == 1) score[0] = ++count;
        for(int i=1; i<data.length; i++)
        {
            if(data[i] == 1) score[i] = ++count;
            else {
                score[i] = 0;
                count = 0;
            }
        }

        int result = 0;
        for(int i=0; i<score.length; i++)
        {
            if(score[i] != 0) result+=score[i];
        }

        System.out.println(result);
    }
}