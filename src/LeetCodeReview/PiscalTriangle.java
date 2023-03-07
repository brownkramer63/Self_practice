package LeetCodeReview;

import java.util.Arrays;
import java.util.List;

public class PiscalTriangle {
    public static void main(String[] args) {

    }
    public static  List<List<Integer>> generate(int numRows) {
    int[][] multidim=new int[numRows][];
        for (int i = 0; i <numRows ; i++) {
         int[] row = new int[i+1];
         row[0]=1;
         row[i]=1;

            for (int j = 1; j <i ; j++) {

                row[j]= multidim[i-1][j-1]+multidim[i-1][j];
            }
multidim[i]=row;
        }
        return (List) Arrays.asList(multidim);
    }
}
