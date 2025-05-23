package reviews.reviws2;

import java.util.Scanner;
public class Hukusyuu16 {
    public static void main(String[] args) {
        int n = 7;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        for(i = 1 ; i < n ; i++){
            int num1 = sc.nextInt();
            sum = sum + num1;
        }
        System.out.println("結果" + sum);

    }
}