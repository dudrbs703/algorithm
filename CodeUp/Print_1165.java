import java.util.Scanner;

/**
 * Print_1164
 */
public class Print_1165 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int score = 0;
        int tmp = a;
        for(int i=a; i<90; i++)
        {
            if(tmp == i )
            {
                //System.out.println(i);
                score++;
                tmp+=5;
            }
        }
        
        System.out.println(score+b);
    }
}