import java.util.Scanner;

class Print_1170
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String group = scanner.next();
        String number = scanner.next();
        scanner.close();

        if(number.length() < 2)
        {
            number = "0"+number;
        }

        System.out.println(grade+group+number);
    }
}