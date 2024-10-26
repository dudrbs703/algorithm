import java.util.Scanner;

/**
 * Print_1109
 */
public class Print_1109 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        String dept_code = scanner.next();
        float key = scanner.nextFloat();

        scanner.close();

        System.out.println(name);
        System.out.println(age);
        System.out.println(dept_code);
        System.out.println(key);
    }
}