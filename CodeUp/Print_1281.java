import java.util.Scanner;

/**
 * Print_1281
 */
public class Print_1281 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;
        String s = "";

        System.out.println("-----------");
        for(int i=a; i<=b; i++)
        {
            if(i%2 != 0) {
                answer -= (i * -1);
                if(s != "") s+= "+"+i;
                else s+=i;
            }
            else {
                answer += (i * -1);
                s+= "-"+i;
            }
        }

        System.out.println(s+"="+answer);
    }
}