import java.util.Scanner;

class Print_1173
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        if(hour >=24) hour = 24;
        if(minute < 30)
        {
            if(hour == 0) hour = 24;
            hour--;
            minute = 60 + minute - 30;
        } else minute-=30;
    
        System.out.println(hour+" "+minute);
    }
}