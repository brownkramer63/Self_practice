package HackerRank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        List<Integer> arr1=new ArrayList<>();
        arr1.add(256741038);
        arr1.add(623958417);
        arr1.add(467905213);
        arr1.add(714532089);
        arr1.add(938071625);
plusMinus(arr);
miniMaxSum(arr1);
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
    public static void miniMaxSum1(List<Integer> arr) {
        // Write your code here
        Long lower= Long.valueOf(0);
        Long higher= Long.valueOf(0);
      arr= arr.stream().sorted().collect(Collectors.toList());
        for (int i = 1; i <arr.size() ; i++) {
           higher=higher+arr.get(i);
        }
        for (int i = 0; i <arr.size()-1 ; i++) {
            lower=lower+ arr.get(i);
        }
        System.out.println(lower+" "+higher);

    }

    public static void miniMaxSum(List<Integer> arr){
        Long small= Long.valueOf(0);
        Long large= Long.valueOf(0);
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = 0; j <arr.size() ; j++) {
                if (arr.get(i) != arr.get(j) && arr.get(i)+ arr.get(j)>large){
                    large= Long.valueOf(arr.get(i)+ arr.get(j));
                }
                if (arr.get(i) != arr.get(j) && arr.get(i)+ arr.get(j)<small){
                    small= Long.valueOf(arr.get(i)+ arr.get(j));
                }
            }
        }
        System.out.println(small+" "+large);
    }
}
