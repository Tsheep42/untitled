package reviews.reviws3.Hukusyuu29;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        KeyInput key = new KeyInput();
        System.out.println("宛先を入力＞");
        String to = key.readString();
        System.out.println("件名を入力＞");
        String subject = key.readString();
        System.out.println("本文を入力＞");
        String body = key.readString();
        System.out.println(to+"に以下のメールを送信しました。");
        System.out.println("件名:"+subject);
        System.out.println("本文:"+body);
    }
}
