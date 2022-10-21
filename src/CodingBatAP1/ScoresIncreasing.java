package CodingBatAP1;

public class ScoresIncreasing {
    public static void main(String[] args) {

        int[] score={1,1,2,4,4,7};
    }
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i <scores.length ; i++) {
            if (!(scores[i]>=scores[i-1])){
               return false;
            }
        }
        return true;
        //need to revise this
    }
}
