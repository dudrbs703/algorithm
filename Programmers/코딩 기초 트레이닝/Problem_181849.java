
public class Problem_181849 {
    public static void main(String[] args) {

        String num_str = "123456789";
        int len = num_str.length();
        int result = 0;

        for (int i = 0; i < len; i++) {
            result += Character.getNumericValue(num_str.charAt(i));
        }
        System.out.println(result);
    }
}
