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
    public static boolean scores100(int[] scores) {
        for (int i = 1; i <scores.length-1 ; i++) {
            if (scores[i-1]==100 && scores[i]==100){
                return true;
            }
            if (scores[i+1]==100 && scores[i]==100){
                return true;
            }
        }
        return false;
    }
}
