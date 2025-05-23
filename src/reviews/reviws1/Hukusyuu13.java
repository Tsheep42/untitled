package reviews.reviws1;

public class Hukusyuu13 {
    public static void main(String[] args) {
        double randomNum = Math.random() * 3;
        int fortune = (int) randomNum;
        if(fortune >=1 && fortune <=3){
            if(fortune == 1){
                System.out.println("大吉");
            }else if(fortune == 2){
                System.out.println("中吉");
            }else if(fortune == 2) {
                System.out.println("小吉");
            }
        }
    }
}
