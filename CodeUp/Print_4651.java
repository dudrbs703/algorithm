import java.util.Scanner;

/**
 * Print_4651
 */
public class Print_4651 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]data = new int[3][4];

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length;j++)
            {
                data[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int back = 0;
        int front = 0;

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length;j++)
            {
                if(data[i][j] == 0) front++;
                else back++; 
            }

            if(front == 1 && back == 3) System.out.println("A");
            else if(front == 2 && back == 2) System.out.println("B");
            else if(front == 3 && back == 1) System.out.println("C");
            else if(front == 4 && back == 0) System.out.println("D");
            else if(front == 0 && back == 4) System.out.println("E");
            
            back = 0;
            front = 0;
        }

    }
}