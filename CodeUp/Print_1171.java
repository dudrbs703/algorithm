import java.util.Scanner;

class Print_1171
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String group = scanner.next();
        String number = scanner.next();
        scanner.close();

        if(group.length() < 2)
        {
            group = "0"+group;
        }

        if(number.length() == 1)
        {
            number = "00"+number;
        } else if(number.length() == 2) {
            number = "0"+number;
        } 

        System.out.println(grade+group+number);
    }
}