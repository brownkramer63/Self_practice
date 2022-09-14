package CodingBat;

import java.util.List;

public class moreY {
    public static void main(String[] args) {

    }
    public List<String> moreY(List<String> strings) {

        strings.replaceAll(s -> "y"+s+"y");

        return strings;
    }
}
