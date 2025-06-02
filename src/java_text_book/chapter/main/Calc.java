package java_text_book.chapter.main;

import java_text_book.chapter.calc.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = java_text_book.chapter.calc.CalcLogic.tasu(a,b);
        int delte = java_text_book.chapter.calc.CalcLogic.hiku(a,b);
        System.out.println("足すと" + total + "、引くと" + delte);
    }
}
