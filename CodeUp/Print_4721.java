import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class NumberRank implements Comparable<NumberRank>
{
    private int rank;
    private int score;

    public NumberRank(int rank, int score)
    {
        this.rank = rank;
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(NumberRank o) {
        return o.score > rank ? 1 : -1;
    }
}
/**
 * Print_4721
 */
public class Print_4721 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<time; i++)
        {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();

            map.put(1, map.getOrDefault(1, 0) + first);
            map.put(2, map.getOrDefault(2, 0) + second);
            map.put(3, map.getOrDefault(3, 0) + third);
        }
        scanner.close();

        PriorityQueue<NumberRank> queue = new PriorityQueue<>();
        for(int i=1; i<=3; i++)
        {
            queue.offer(new NumberRank(i, map.get(i).intValue()));
        }

        System.out.println(queue.peek().getRank() + " " + queue.peek().getScore());
    }
}