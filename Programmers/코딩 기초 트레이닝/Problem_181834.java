public class Problem_181834 {

    public static void main(String[] args) {

        String myString = "abcdevwxyz";

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l')
                buffer.append('l');
            else
                buffer.append(myString.charAt(i));
        }

        System.out.println(buffer.toString());
    }
}
