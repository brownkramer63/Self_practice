package CodingBatAP1;

import java.util.ArrayList;
import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }
    public static Object[] seriesUp(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int index=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                arr.add(j);
            }
        }

        Object[] obj= arr.toArray();
        return obj;
       }
    public int countClumps(int[] nums) {
        int holder=0;
        for(int i=1; i<nums.length-1; i++){

            if(nums[i]==nums[i-1] || nums[i]==nums[i+1]){
                holder++;
            }

        }
        return holder/2;
    }
    public boolean scores100(int[] scores) {
        for(int i=1; i<scores.length; i++){
            if(scores[i]==100 && scores[i-1]==100){
                return true;
            }
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }
    public int scoreUp(String[] key, String[] answers) {
        int score =0;
        for (int i = 0; i < key.length ; i++) {
            if (key[i].equals(answers[i])){
                score=score+4;
            } else if ((!answers[i].equals(key[i])) && (!answers[i].equals("?"))) {
                score=score-1;
            }


        }
        return score;
    }
    }

