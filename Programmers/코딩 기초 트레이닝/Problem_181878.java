public class Problem_181878 {
    public static void main(String[] args) {

        String myString = "AbCdEfG";
        String pat = "aBc";

        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        if (myString.contains(pat))
            System.out.println(1);
        else
            System.out.println(0);

    }
}
