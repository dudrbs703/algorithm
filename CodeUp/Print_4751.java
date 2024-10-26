import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4751
 */

class Score implements Comparable<Score>
{
    private int country;
    private int n;
    private int score;

    public Score(){ }

    public int getCountry() {
        return country;
    }

    public int getN() {
        return n;
    }

    public int getScore() {
        return score;
    }

    public void setCountry(int country) {
        this.country = country;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Score o) {
        return o.getScore() > getScore() ? 1 : -1;
    }
}

public class Print_4751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        PriorityQueue<Score> queue = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a; i++)
        {
            Score score = new Score();
            score.setCountry(scanner.nextInt());
            score.setN(scanner.nextInt());
            score.setScore(scanner.nextInt());
            queue.offer(score); 
        }
        scanner.close();

        int count = 0;
    
        while(!queue.isEmpty())
        {
            if(count <= 2)
            {
                Score score = queue.poll();
                map.put(score.getCountry(), map.getOrDefault(score.getCountry(), 0) + 1);
                for(Map.Entry<Integer, Integer> entry : map.entrySet())
                {
                    if(score.getCountry() == entry.getKey() && entry.getValue() <= 2)
                    {
                        System.out.println(score.getCountry()+" "+score.getN());
                        count++;
                    } else continue;
                }
            } else break;
        }
    }
}