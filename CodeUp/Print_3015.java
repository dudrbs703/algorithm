import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_3015
 */

class StudentScore implements Comparable<StudentScore>
{
    private String name;
    private int score;
    private int seq;

    public StudentScore(String name, int score, int seq)
    {
        this.name = name;
        this.score = score;
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    @Override
    public int compareTo(StudentScore o) {
        if(this.score > o.getScore()) return -1;
        if(this.score == o.getScore() && this.seq < o.getSeq()) return -1;
        else return 1;
    }
}

public class Print_3015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<StudentScore> queue = new PriorityQueue<>();

        int time = scanner.nextInt();
        int limit = scanner.nextInt();
        int seq = 0;

        for(int i=0; i<time; i++)
        {
            queue.offer(new StudentScore(scanner.next(), scanner.nextInt(), seq++));
        }

        scanner.close();

        StudentScore student = null;

        for(int i=0; i<limit; i++)
        {
            student = queue.poll();
            System.out.println(student.getName());
        }
    }
}