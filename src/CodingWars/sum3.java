package CodingWars;

public class sum3 {
//
//    Given an array of ints length 3, return the sum of all the elements.
//
//
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7555
public static void main(String[] args) {

    int[] nums={1,2,3};
    System.out.println(sum3(nums));
}
    public static int sum3(int[] nums) {
    int answer =0;
        for (int each:nums
             ) {
            answer+=each;
        }
        return answer;
    }

}
