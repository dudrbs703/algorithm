import java.util.Scanner;

public class Problem_181949 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int size = input.length();

        scanner.close();

        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(input.charAt(i)))
                System.out.print(Character.toLowerCase(input.charAt(i)));
            else
                System.out.print(Character.toUpperCase(input.charAt(i)));
        }
    }
}
