public class Problem_181838 {
    public static void main(String[] args) {
        int[] data1 = { 2022, 1, 1 };
        int[] data2 = { 2021, 12, 31 };

        String data1_string = data1[0] + "" + data1[1] + "" + data1[2];
        String data2_string = data2[0] + "" + data2[1] + "" + data2[2];

        if (Integer.parseInt(data1_string) < Integer.parseInt(data2_string))
            System.out.println(0);
        else
            System.out.println(1);
    }
}
