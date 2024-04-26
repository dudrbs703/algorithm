public class Problem_181841 {
    public static void main(String[] args) {

        String[] str_list = { "abc", "def", "ghi" };
        String ex = "ef";

        StringBuilder builder = new StringBuilder();

        int count = 0;
        for (String s : str_list) {
            if (!s.contains(ex)) {
                builder.append(s);
                count++;
            }
        }

        System.out.println(count == str_list.length ? "" : builder.toString());
    }
}
