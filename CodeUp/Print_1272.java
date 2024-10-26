import java.util.Scanner;

/**
 * Print_1272
 */
public class Print_1272 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int john = scanner.nextInt();
        int bob = scanner.nextInt();
        scanner.close();

        int max = john > bob ? john : bob;

        int bob_result = 0;
        int john_result = 0;

        int money = 0;

        for(int i=1; i<=max; i++)
        {
            if(i % 2 == 1) money = (i + 1) / 2;
            else money = (i / 2) * 10;

            if(i == john) john_result = money;
            if(i == bob) bob_result = money;
        }
    
        System.out.println(bob_result + john_result);
    }
}

//8318 346
//43320