package CodingWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFish {
    public static void main(String[] args) {
        String data="iiisdoso";

    }



        public static int[] parse(String data) {
            // Implement me! :
int result = 0;
            List<Integer> resultarr = new ArrayList<>();
            for (char each: data.toCharArray()
                 ) {
                switch (each){
                    case 'i':  result++;break;
                    case 'd': result--;break;
                    case 's': result*=result;break;
                    case 'o': resultarr.add(result); break;



                }
            }
        return resultarr.stream().mapToInt(Integer::intValue).toArray();


        }}

