import java.util.Scanner;

public class Problem_181945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();

        int size = a.length();
        for (int i = 0; i < size; i++) {
            System.out.println(a.charAt(i));
        }
    }
}
