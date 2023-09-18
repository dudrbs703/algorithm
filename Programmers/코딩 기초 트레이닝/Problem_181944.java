import java.util.Scanner;

public class Problem_181944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();

        if (a % 2 == 0)
            System.out.println(a + " is even");
        else
            System.out.println(a + " is odd");
    }
}
