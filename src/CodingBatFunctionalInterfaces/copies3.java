package CodingBatFunctionalInterfaces;

import java.util.List;

public class copies3 {
    public static void main(String[] args) {

    }
    public List<String> copies3(List<String> strings) {
strings.replaceAll(n -> n+n+n);

return strings;
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n<0);
        return nums;
    }

}
