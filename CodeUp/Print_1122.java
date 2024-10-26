import java.util.Scanner;

/**
 * Print_1122
 */
public class Print_1122 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        int time = 0;

        while(true)
        {
            if(a>=60)
            {
                a-=60;
                time++;
            } else{
                System.out.println(time+" "+a);
                break;
            }
        }
    }
}