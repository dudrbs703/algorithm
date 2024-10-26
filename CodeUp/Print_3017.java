
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentScore implements Comparable<StudentScore> 
{
	private int seq;
	private int math;
	private int info;

	public StudentScore(int seq, int math, int info) 
	{
		this.seq = seq;
		this.math = math;
		this.info = info;
	}

	public int getSeq() {
		return seq;
	}

	public int getMath() {
		return math;
	}

	public int getInfo() {
		return info;
	}


	@Override
	public int compareTo(StudentScore o) {
		if (math > o.math) return -1;
		if (math == o.math && info > o.info) return -1;
        if (info == o.info && seq < o.seq) return -1;
		return 1;
	}
}

public class Print_3017 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<StudentScore> list = new ArrayList<>();
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) 
		{
			list.add(new StudentScore(i + 1, scanner.nextInt(), scanner.nextInt()));
		}
		scanner.close();

		Collections.sort(list);

		for (StudentScore student : list)
		{
			System.out.println(student.getSeq() + " " + student.getMath() + " " + student.getInfo());
		}

	} 
} 