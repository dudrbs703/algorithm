import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Print_1805
 */

class Machine implements Comparable<Machine>
{
    private int idx;
    private int gas;

    public Machine(int idx, int gas)
    {
        this.idx = idx;
        this.gas = gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getGas() {
        return gas;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(Machine o) {
        return this.idx > o.getIdx() ? 1 : -1;
    }
}
public class Print_1805 {

    public static void main(String[] args) {
        PriorityQueue<Machine> list = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        for(int i=0; i<time; i++)
        {
            list.add(new Machine(scanner.nextInt(), scanner.nextInt()));
        }

        scanner.close();

        Machine m = null;
        while(!list.isEmpty())
        {
            m = list.poll();
            System.out.println(m.getIdx() +" "+m.getGas());
        }
    }
}