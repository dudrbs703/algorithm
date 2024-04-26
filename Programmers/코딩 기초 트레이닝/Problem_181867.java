import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Problem_181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";

        Queue<Character> tmp = new ArrayDeque<>();
        for (int i = 0; i < myString.length(); i++) {
            tmp.add(myString.charAt(i));
        }

        List<Integer> answer = new ArrayList<>();

        int count = 0;
        char c = '0';
        while (!tmp.isEmpty()) {

            c = tmp.poll();
            if (c == 'x') {
                answer.add(count);
                count = 0;
            } else
                count++;

        }
        answer.add(count);

        System.out.println(answer);

    }
}
