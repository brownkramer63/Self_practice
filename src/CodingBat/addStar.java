package CodingBat;

import java.util.List;

public class addStar {
    public static void main(String[] args) {

    }
    public List<String> addStar(List<String> strings) {
strings.replaceAll(s -> s+"*");
return strings;
    }
}
