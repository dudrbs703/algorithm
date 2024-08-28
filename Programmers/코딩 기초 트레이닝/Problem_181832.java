/**
 * Problem_181832
 */
public class Problem_181832 {

    public static void main(String[] args) {
        int n = 4;

        int [][]answer = new int[n][n];

        int count = 1;

        int right = 0;
        int left = 1;
        int up = 2;
        int down = 3;

        int direction = right;
        int row = 0;
        int column = 0;
        

        for(int i=0; i<answer.length; i++)
        {
            for(int j=0; j<answer[i].length; j++)
            {
                System.out.print(answer[i][j] + " ");
            }

            System.out.println();
        }
    }
}