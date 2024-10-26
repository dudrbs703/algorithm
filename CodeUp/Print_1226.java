import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1226
 */
public class Print_1226 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []a = new int[7];
        int []b = new int[6];
        int a_size = a.length - 1;

        for(int i=0; i<a.length ; i++)
        {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<b.length; i++)
        {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int correct = 0;

        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(b[i] == a[j]) correct++; 
            }
        }

        switch(correct)
        {
            case 6:
                System.out.println("1");
                break;

            case 5:
                for(int i=0; i<b.length; i++)
                {
                    if(a[a_size] == b[i]) {
                        System.out.println("2");
                        System.exit(0);
                    }
                }
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 3:
                System.out.println("5");
                break;

            default:
                System.out.println("0");
                break;
        }
       
    }
}

// 21 32 33 41 44 45 20
// 21 32 41 43 44 45
// 3