import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Data implements Comparable<Data>
{
    private int idx;
    private int data;

    public Data(int idx, int data)
    {
        this.idx = idx;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public int getIdx() {
        return idx;
    }
    
    @Override
    public int compareTo(Data o) {
        if(o.getData() > getData()) return 1;
        else return -1;
    }
}

/**
 * Print_4591
 */
public class Print_4591 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PriorityQueue<Data> queue = new PriorityQueue<>();

        for(int i=0; i<9; i++)
        {
            queue.offer(new Data(i+1, scanner.nextInt()));
        }
        scanner.close();

        Data data = queue.poll();
        System.out.println(data.getData());
        System.out.println(data.getIdx());
    }
}