/**
 * Problem_181832
 */
public class Problem_181832 {

    public static void main(String[] args) {
        int n = 5;

        int[][] answer = new int[n][n];

        int count = 1;

        int right = 0;
        int left = 1;
        int up = 2;
        int down = 3;

        int direction = right;
        int row = 0;
        int column = 0;

        while (count <= n * n) {
            while (direction == right) {
                if (column >= n || answer[row][column + 1] != 0) {
                    column--;
                    direction = down;
                    row++;
                    break;
                }
                answer[row][column++] = count++;
            }

            while (direction == down) {
                if (row >= n || answer[row + 1][column] != 0) {
                    row--;
                    direction = left;
                    column--;
                    break;
                }
                answer[row++][column] = count++;
            }

            while (direction == left) {
                if (column < 0 || answer[row][column - 1] != 0) {
                    if (column == -1)
                        column = 0;
                    column--;
                    direction = up;
                    row--;
                    break;
                }
                answer[row][column--] = count++;
            }
            while (direction == up) {
                if (row >= n || answer[row - 1][column] != 0) {
                    row--;
                    direction = right;
                    column++;
                    break;
                }
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