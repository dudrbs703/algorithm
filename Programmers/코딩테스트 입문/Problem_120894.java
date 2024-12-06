/**
 * Problem_120894
 */
public class Problem_120894 {

    public static void main(String[] args) {

        String numbers = "onefourzerosixseven";
        String []num_eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String []num = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0; i<num_eng.length; i++)
        {
            numbers = numbers.replace(num_eng[i], num[i]);
        }

        System.out.println(Long.parseLong(numbers));

        
    }
}