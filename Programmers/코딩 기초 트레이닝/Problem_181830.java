
/**
 * Problem_181830
 */
public class Problem_181830 {

    public static void main(String[] args) {
        int [][]arr = {
            {572, 22, 37}, {287, 726, 384},
            {85, 137, 292}, {487, 13, 876}
        };

        int heigh = arr.length;
        int width = arr[0].length;
        int square = Math.max(heigh, width);

        int [][]answer = new int[square][square];

        for(int i=0; i<arr.length; i++)
        {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }
        

        for (int[] answer1 : answer) {
            for (int j = 0; j < answer1.length; j++) {
                System.out.print(answer1[j] + " ");
            }
            System.out.println();
        }
    }
}