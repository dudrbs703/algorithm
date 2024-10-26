import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_3019
 */

class Schedule implements Comparable<Schedule>{
    private String schedule;
    private int year;
    private int month;
    private int day;

    public Schedule(String schedule, int year, int month, int day)
    {
        this.schedule = schedule;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getSchedule() {
        return schedule;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public int compareTo(Schedule o) {

        if(year <= o.getYear()) return 1;
        if(year <= o.getYear() && month < o.getMonth()) return -1;
        if(year == o.getYear() && month == o.getMonth() && day<= o.getDay()) return -1;
        
        return 1;
    }
}

public class Print_3019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Schedule> queue = new PriorityQueue<>();
        int a = scanner.nextInt();

        for(int i=0; i<a; i++)
        {
            String schedule = scanner.next();
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            queue.offer(new Schedule(schedule, year, month, day));
        }
        scanner.close();

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll().getSchedule());
        }
    }
}