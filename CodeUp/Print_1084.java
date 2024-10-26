import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/**
 * Print_1084
 */
public class Print_1084 {

    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp[] = reader.readLine().split(" ");
        br.close();

        int r = Integer.parseInt(tmp[0]);
        int g = Integer.parseInt(tmp[1]);
        int b = Integer.parseInt(tmp[2]);
        //scanner.close();

        int a = 0;

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<g; j++)
            {
                for(int k=0; k<b; k++)
                {
                    bw.write(i+" "+j+" "+k +"\n");
                    a++;
                }
            }
        }

        writer.write(String.valueOf(a));
        writer.flush();
    }
}