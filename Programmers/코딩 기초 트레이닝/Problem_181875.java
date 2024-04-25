import java.util.Arrays;

public class Problem_181875 {

    public static void main(String[] args) {

        String[] strArr = { "AAA", "BBB", "CCC", "DDD" };

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0)
                strArr[i] = strArr[i].toLowerCase();
            else
                strArr[i] = strArr[i].toUpperCase();
        }

        System.out.println(Arrays.toString(strArr));

    }
}
