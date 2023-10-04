public class Problem_181915 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };

        System.out.println(solution(my_string, index_list));
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuffer buffer = new StringBuffer();
        for (int i : index_list) {
            buffer.append(my_string.charAt(i));
        }

        return buffer.toString();
    }
}
