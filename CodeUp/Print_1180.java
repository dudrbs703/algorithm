import java.util.Scanner;

class Print_1180
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();
        a = String.valueOf(a.charAt(1))+String.valueOf(a.charAt(0));

        int b = Integer.parseInt(a) * 2;
        
        if(b >= 100) {
            //System.out.println(String.valueOf(b).charAt(1)+""+String.valueOf(b).charAt(2));
            String tmp = String.valueOf(b).charAt(1)+""+String.valueOf(b).charAt(2);
            b = Integer.parseInt(tmp);
        }
        
        if(b <= 50) {
            System.out.println(b);
            System.out.println("GOOD");
        } else {
            System.out.println(b);
            System.out.println("OH MY GOD");
        }
    }
}