import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1420
 */

class StudentScore implements Comparable<StudentScore>
{
    private String name;
    private int score;

    public StudentScore(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(StudentScore o) {
        return o.getScore() > score ? 1 : -1;
    }
    
}

public class Print_1420 {

    public static void main(String[] args) {
        
        PriorityQueue<StudentScore> queue = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i=0; i<a; i++)
        {
            queue.offer(new StudentScore(scanner.next(), scanner.nextInt()));
        }

        int count = 0;
        while (true) {
            count++;
            if(count == 3)
            {
                System.out.println(queue.poll().getName());
                break;
            } else queue.poll();
        }
    }
}