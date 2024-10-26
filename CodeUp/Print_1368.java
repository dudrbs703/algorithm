import java.util.Scanner;

/**
 * Print_1368
 */
public class Print_1368 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int k = scanner.nextInt();
        String d = scanner.next();
        scanner.close();

        if(d.equals("L"))
        {

            /*
            for(int i=0; i<h; i++)
            {
                for(int j=0; j<i; j++)
                {
                    System.out.print(" ");
                }

                for(int j=0; j<k; j++)
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
            */
            for(int i=1; i<=h; i++)
            {
                for(int j=1; j<i; j++)
                {
                    System.out.print(" ");
                }

                for(int j=0; j<k; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if(d.equals("R")) 
        {
            /*
            for(int i=k; i>=0; i--)
            {
                for(int j=i-1; j>=0; j--)
                {
                    System.out.print(" ");
                }
                for(int j=0; j<k; j++)
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
            */
            for(int i=0; i<h; i++)
            {
                for(int j=i; j<h-1; j++)
                {
                    System.out.print(" ");
                }

                for(int j=0; j<k; j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}