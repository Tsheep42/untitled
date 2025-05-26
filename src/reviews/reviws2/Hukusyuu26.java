package reviews.reviws2;

public class Hukusyuu26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{12,24,14,23,54,12,65};
        int target = 12;
        int count = 0;
        for (int i  = 0; i < numArray.length; i++){
            if(numArray[i]==target){
                count++;
            }
        }
        System.out.println("探索した値:"+ target);
            System.out.println("一致した数:"+ count);
    }
}
