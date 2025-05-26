package reviews.reviws2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Hukusyuu16 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = 7;
        int sum = 0;
        int i = 0;
        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("結果"+sum);
    }
}