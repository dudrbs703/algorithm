public class Problem_181873 {

    public static void main(String[] args) {

        String my_string = "programmers";
        String alp = "p";

        if (my_string.contains(alp))
            my_string = my_string.replace(alp, alp.toUpperCase());

        System.out.println(my_string);
    }
}
