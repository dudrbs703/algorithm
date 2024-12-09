//package algorithm.Programmers.위클리 챌린지;

public class Problem_82612 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        int answer = 0;

        int time = 0;
        while (time++ < count) {
            answer += price;
        }

        System.out.println(money + " " + answer);
    }
}
