package practice03302023;

public class scoresincreasing {
    public static void main(String[] args) {

    }
    public static boolean scoreincreasing(int[] scores){
        int answer=0;
        for (int i = 1; i <scores.length ; i++) {
            if (scores[i-1]>scores[i]){
                return false;
            }
        }
        return true;
    }
}
