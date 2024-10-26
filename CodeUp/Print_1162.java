import java.util.Scanner;

/**
 * Print_1162
 */
public class Print_1162 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();

        String result = String.valueOf(year - month + day);
        if(result.charAt(resolt.length()-1) == '0') System.out.println("대박");
        else System.out.println("그럭저럭");
    }
}