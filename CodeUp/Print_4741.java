import java.util.Scanner;

/**
 * Print_4741
 */
public class Print_4741 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int k = scanner.nextInt();
        int minute = scanner.nextInt() + k;
        int tmp = minute/60;
        scanner.close();

        if(minute < 60) System.out.println(hour+" "+minute);
        else {
            for(int i=0; i<tmp; i++)
            {
                hour++;
                minute-=60;
            }
            if(hour >= 24) hour -= 24;
            System.out.println(hour+" "+minute);
        }
    }
}