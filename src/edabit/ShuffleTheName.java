package edabit;

public class ShuffleTheName {
    public static void main(String[] args) {

    }
    public static String nameShuffle(String s) {

        String[] list = s.split(" ");
        return list[1]+" "+list[0];
    }
}
