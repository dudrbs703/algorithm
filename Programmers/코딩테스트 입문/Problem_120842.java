/**
 * Problem_120842
 */
public class Problem_120842 {

    public static void main(String[] args) {
        int []num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 2;

        int [][]answer = new int[num_list.length/n][n];

        int position = 0;
        for(int i=0; i<answer.length; i++)
        {
            for(int j=0; j<answer[i].length; j++)
            {
                answer[i][j] = num_list[position++];
            }
        }

        for(int i=0; i<answer.length; i++)
        {
            for(int j=0; j<answer[i].length; j++)
            {
                System.out.print(answer[i][j]+" ");
            }

            System.out.println();
        }
        //System.out.println(Arrays.toString(answer));
    }
}