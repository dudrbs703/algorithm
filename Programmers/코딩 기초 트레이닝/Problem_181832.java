/**
 * Problem_181832
 */
public class Problem_181832 {

    public static void main(String[] args) {
        int n = 4;

        int[][] answer = new int[n][n];

        int size = (int)Math.pow(n, 2);
        int count = 1;

        int row = 0;
        int column = 0;

        int right = 0;
        int left = 1;
        int up = 2;
        int down = 3;

        int direction = right;

        while (count <= size) {

            if(n == 1)
            {
                answer[row][column] = count;
                break;
            }
            
            while (direction == right) {
                if (column >= n || answer[row][column] != 0) {
                    column--;
                    direction = down;
                    row++;
                    break;
                }
                if( answer[row][column] != 0) break;
                answer[row][column++] = count++;
            }

            if(count >= size) break;

            while (direction == down) {
                if (row >= n || answer[row][column] != 0) {
                    row--;
                    direction = left;
                    column--;
                    break;
                }
                if( answer[row][column] != 0) break;
                answer[row++][column] = count++;
            }

            if(count >= size) break;

            while (direction == left) {
                if (column == -1) column = 0;
                if (column < 0 || answer[row][column] != 0) {
                    direction = up;
                    row--;
                    if(answer[row][column] != 0) column++;
                    //column++;
                    break;
                }
                answer[row][column--] = count++;
            }

            if(count >= size) break;

            while (direction == up) {
                if (row < 0 || answer[row][column] != 0) {
                    row++;
                    direction = right;
                    column++;
                    break;
                }

                if( answer[row][column] != 0) break;

                answer[row--][column] = count++;
            }

        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }

            System.out.println();
        }
    }
}