package practice03302023;

import java.util.ArrayList;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {

    }
    public static int superDigit(String n, int k) {
        // Write your code here
        ArrayList<String> arr = new ArrayList<>();
        if (n.length()==1){
            return Integer.parseInt(n);
        }
        char[] array1 = n.toCharArray();
        for (int i = 0; i <array1.length ; i++) {
           arr.add(array1[i]+"");
        }
        // added all to array now sum them up
        int z =0;
        for (int i = 0; i <arr.size() ; i++) {
            z=z+Integer.parseInt(arr.get(i));
        }
        if (z<10){
            return z;
        }

            n=Integer.toString(z);
          return   superDigit(n,k);

    }
}
