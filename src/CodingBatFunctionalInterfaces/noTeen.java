package CodingBatFunctionalInterfaces;

import java.util.List;

public class noTeen {
    public static void main(String[] args) {

    }
    public static List<Integer> noTeen(List<Integer> nums) {
nums.removeIf(n -> n>=13 && n<=19);

return  nums;

    }

}
