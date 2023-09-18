import java.util.Scanner;

public class Problem_181950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.next();
        int count = scanner.nextInt();

        scanner.close();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(tmp);
        }

        System.out.println(builder.toString());
    }
}
