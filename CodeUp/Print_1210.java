import java.util.Scanner;

/**
 * Print_1210
 */
public class Print_1210 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        for(int i=0; i<2; i++)
        {
            switch(scanner.nextInt())
            {
                case 1:
                    result += 400;
                    break;
                case 2:
                    result += 340;
                    break;
                case 3:
                    result += 170;
                    break;
                case 4:
                    result += 100;
                    break;
                case 5:
                    result += 70;
                    break;
            }
        }
        scanner.close();

        if(result <= 500) System.out.println("no angry");
        else System.out.println("angry");
    }
}