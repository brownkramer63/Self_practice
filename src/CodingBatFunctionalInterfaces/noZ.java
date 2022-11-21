package CodingBatFunctionalInterfaces;

import java.util.List;

public class noZ {
    public static void main(String[] args) {

    }
    public List<String> noZ(List<String> strings) {

        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

}
