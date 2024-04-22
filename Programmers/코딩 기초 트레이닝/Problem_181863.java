public class Problem_181863 {
    public static void main(String[] args) {
        String rny_string[] = {
                "masterpiece",
                "programmers",
                "jerry",
                "burn"
        };

        for (String word : rny_string) {

            System.out.println(solution(word));
        }
    }

    public static String solution(String word) {

        return word.replaceAll("m", "rn");

    }
}
