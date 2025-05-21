import java.util.Scanner;
public class Hukusyu2 {
    public static void main(String[] args) {
        //練習問題15
        int num =24;

        if(num % 2 == 0){
            System.out.println("偶数");
        } else if(num % 2 == 1){
            System.out.println("奇数");
        } else {
            System.out.println("無効な入力です。");
        }
        System.out.println("\n");

        //練習問題16
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
