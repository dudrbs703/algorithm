import java.util.Scanner;

class Print_1202
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        if(a >= 90)
        {
            System.out.println("A");
        }
        if(a >= 80 && a<=89)
        {
            System.out.println("B");
        }
        if(a >= 70 && a<=79)
        {
            System.out.println("C");
        }
        if(a >= 60 && a<=69)
        {
            System.out.println("D");
        }
        if(a < 60)
        {
            System.out.println("F");
        }
       
    }
}