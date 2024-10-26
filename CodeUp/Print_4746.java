import java.util.Scanner;

/**
 * Print_4746
 */
public class Print_4746 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        while(d >= 60)
        {
            d -= 60;
            minute++;

            if(minute >= 60){
                hour++;
                minute = 0;
            }
            if(hour >= 24) hour %= 24;

        }

        second+=d;

        if(second >= 60)
        {
            second %= 60;
            minute++;
        }
        if(minute >= 60)
        {
            minute %= 60;
            hour++;
        }
        if(hour >= 24) hour %= 24;

        System.out.println(hour+" "+minute+" "+second);
    }
}