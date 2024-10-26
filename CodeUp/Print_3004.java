import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_3004
 */

class InnerData implements Comparable<InnerData>
{
    private int idx;
    private int data;

    public InnerData(int idx, int data)
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

    public void setData(int data) {
        this.data = data;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @Override
    public int compareTo(InnerData o) {
        return this.data > o.getData() ? 1 : -1;
    }
}

class NewData implements Comparable<NewData>
{
    private int idx;
    private int data;
    private int rank;

    public NewData(int idx, int rank, int data)
    {
        this.idx = idx;
        this.data = data;
        this.rank = rank;
    }

    public int getData() {
        return data;
    }

    public int getIdx() {
        return idx;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(NewData o) {
        return this.idx > o.getIdx() ? 1 : -1;
    }
}

public class Print_3004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<InnerData> queue = new PriorityQueue<>();
        int time = scanner.nextInt();

        for(int i = 0; i<time; i++)
        {
            queue.offer(new InnerData(i, scanner.nextInt()));
        }

        scanner.close();
        
        PriorityQueue<NewData> datas = new PriorityQueue<>();
        InnerData data = null;
        int rank = 0;
        
        while(!queue.isEmpty())
        {
            data = queue.poll();
            datas.offer(new NewData(data.getIdx(), rank++ ,data.getData()));
        }

        while(!datas.isEmpty())
        {
            System.out.print(datas.poll().getRank() +" ");
        }
    }
}