/**
 * Print_1382
 */
public class Print_1382 {

    public static void main(String[] args) {
        String [][]data = new String[9][4];

        int dan = 2;

        for(int level=0; level<4; level++)
        {
            for(int i=0; i<9; i++)
            {
                data[i][level] = String.format("%d x%2d = %2d", dan,i+1,dan*(i+1));
            }
            dan++;
        }

        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[i].length; j++)
            {
                System.out.print(String.format("%s\t", data[i][j]));
            }
            System.out.println();
        }
    }
}