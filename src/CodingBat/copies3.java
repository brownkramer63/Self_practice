package CodingBat;

import java.util.List;

public class copies3 {
    public static void main(String[] args) {

    }
    public List<String> copies3(List<String> strings) {
strings.replaceAll(s -> s+s+s);
        return strings;
    }
}
