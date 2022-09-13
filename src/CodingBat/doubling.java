package CodingBat;

import java.util.List;

public class doubling {
    public static void main(String[] args) {

    }
    public List<Integer> doubling(List<Integer> nums) {
 nums.replaceAll(n -> n*2);
 return nums;
    }
}
