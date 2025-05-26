package reviews.reviws2;

import java.io.*;
public class Hukusyuu18 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = 7;
        int sum = 0;
        int i = 1;
        while (i <=num) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("結果"+sum);
    }
}