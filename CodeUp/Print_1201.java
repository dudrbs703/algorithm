import java.util.Scanner;

class Print_1201
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        
       if(a > 0) System.out.println("양수");
       else if(a == 0) System.out.println("0");
       else System.out.println("음수");
    }
}