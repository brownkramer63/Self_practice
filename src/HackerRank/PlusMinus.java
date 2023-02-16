package HackerRank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int divider=arr.size();
        double positive=0;
        double negative=0;
        double zero=0;
        for (Integer each : arr) {
            if(each>0){
                positive++;
            }
            if(each<0){
                negative++;
            }
            if(each==0){
                zero++;
            }
        }
        DecimalFormat df= new DecimalFormat("#.000000");
        System.out.println(df.format(positive/divider));
        System.out.println(df.format(negative/divider));
        System.out.println(df.format(zero/divider));
    }
}
