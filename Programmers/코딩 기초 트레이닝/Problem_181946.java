import java.util.Scanner;

public class Problem_181946 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(b);

        System.out.println(builder.toString());
    }
}
