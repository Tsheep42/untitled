package reviews.reviws2;

import java.io.*;
public class Hukusyuu18 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = 7;
        int sum = 0;
        int i = 0;
        for (i = 1; i <= num; i++) {
            System.out.print("数値を入力＞");
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1){
                sum = sum + n;
            }
        }
        System.out.println("結果"+sum);
    }
}