package reviews.reviws2;

public class Hukusyuu19 {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int factorinal = 1;
        while (i < num){
            factorinal = factorinal * i;
            i = i + 1;
        }
        System.out.println("結果" + factorinal);
    }
}
