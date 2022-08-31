package CodingWars;
import java.util.*;
public class directions {
    public static void main(String[] args) {

        String[] arr={"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(arr)));

    }


        public static String[] dirReduc(String[] arr) {
            // Your code here.
            int North = 0;
            int South =0;
            int East=0;
            int West=0;
            int answerNS=0;
            int answerEW=0;
            List<String> finalanswer= new ArrayList<String>();

            for(String each: arr){
                if(each.equals("North")){
                    North++;
                }
                if(each.equals("South")){
                    South++;
                }
                if(each.equals("East")){
                    East++;
                }
                if(each.equals("West")){
                    West++;
                }

            }

            if(North>South){
                answerNS= North-South;
                for(int i=0; i<=answerNS; i++){
                    finalanswer.add("North");
                }
            }
            if(North<South){
                answerNS=South-North;
                for(int i=0; i<=answerNS; i++){
                    finalanswer.add("South");
                }
            }
            if(West>East){
                answerEW= West-East;
                for(int i=0; i<=answerEW; i++){
                    finalanswer.add("West");
                }
            }
            if(West<East){
                answerEW=East-West;
                for(int i=0; i<=answerEW; i++){
                    finalanswer.add("East");
                }
            }

            String[] stockArr= new String[finalanswer.size()];
            stockArr=finalanswer.toArray(stockArr);
            return stockArr;
        }
    }



