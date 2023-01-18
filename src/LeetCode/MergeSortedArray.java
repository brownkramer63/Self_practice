package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSortedArray {
    public static void main(String[] args) {
      int[] nums={1,2,3,4,5,6};
      int[] nums2={1,2,3,4,5,6};
      int m =3;
      int n=3;

        System.out.println(Arrays.toString(merge(nums, m, nums2, n)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
int[] answer= new int[m+n-1];
ArrayList<Integer> lists= new ArrayList<>();
        for (int i = 0; i <m ; i++) {
            lists.add(nums1[i]);

        }
        for (int i = 0; i <n ; i++) {
            lists.add(nums2[i]);
        }
        answer=lists.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
