import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_181886 {

    public static void main(String[] args) {

        String[] name = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };

        List<String> result = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            if (i % 5 == 0)
                result.add(name[i]);
        }

        System.out.println(Arrays.toString(result.stream().toArray(String[]::new)));

    }
}
