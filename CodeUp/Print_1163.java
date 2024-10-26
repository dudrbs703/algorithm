import java.util.Scanner;

/**
 * Print_1163
 */
public class Print_1163 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();

        String result = String.valueOf(year + month + day);
        int size = result.length();
        int a = Integer.parseInt(String.valueOf(result.charAt(size-3)));

        if(a % 2 == 0 ) System.out.println("대박");
        else System.out.println("그럭저럭");
    }
}