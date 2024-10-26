import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_4012
 */

class Rank implements Comparable<Rank>
{
    private int id;
    private int score;
    private int rank;

    public Rank(int id, int score)
    {
        this.id = id;
        this.score = score;
    }
    public Rank(Rank rank)
    {
        this.id = rank.getId();
        this.score = rank.getScore();
        this.rank = rank.getRank();
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Rank o) {
        return score > o.score ? -1 : 1;
    }
}

class ScoreRank implements Comparable<ScoreRank>
{
    private Rank rank;

    public ScoreRank(Rank rank)
    {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public int compareTo(ScoreRank o) {
        return rank.getId() > o.getRank().getId() ? 1 : -1;
    }
}


public class Print_4012 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        PriorityQueue<Rank> queue = new PriorityQueue<>();
        PriorityQueue<ScoreRank> queue_1 = new PriorityQueue<>();

        int a = scanner.nextInt();
        for(int i=0; i<a; i++)
        {
            queue.offer(new Rank(i+1, scanner.nextInt()));
        }
        
        int count = 1;
        while(!queue.isEmpty())
        {
            Rank rank = queue.poll();
            rank.setRank(count++);
            queue_1.offer(new ScoreRank(new Rank(rank)));
        }

        while(!queue_1.isEmpty())
        {
            ScoreRank rank = queue_1.poll();
            System.out.println(rank.getRank().getScore()+" "+rank.getRank().getRank());
        }*/

        int count = scanner.nextInt();
    
    
        int[] score = new int[count];
        int[] rank = new int[count];
        
        for(int i=0; i<count; i++)
        {
            score[i] = scanner.nextInt();;
            rank[i] = 1;
        }

        for(int i = 0; i < count; i++) 
        {
            for(int j = 0; j < count; j++)
            {
                if(score[i] < score[j])
                {
                    rank[i] ++;
                }
            }
            System.out.println(score[i]+" "+rank[i]);
        }

    }
}