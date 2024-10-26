import java.util.Scanner;

/**
 * Print_4771
 */
public class Print_4771 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char []a = scanner.next().toCharArray();
        scanner.close();

        int count = 10;
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i] == '(' && a[i+1] == '(' || a[i] == ')' && a[i+1] == ')') count+=5;
            else count+=10;
        }

        System.out.println(count);
    }
}