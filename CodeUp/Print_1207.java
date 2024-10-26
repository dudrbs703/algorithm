import java.util.Scanner;

/**
 * Print_1207
 */
public class Print_1207 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count  = 0;
        for(int i=0; i<4; i++)
        {
            int a = scanner.nextInt();
            if(a == 1) count++;
        }
        scanner.close();

        switch(count)
        {
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            case 0:
                System.out.println("모");
                break;
        }
    }
}