package edabit;

public class Stuttering {
    public static String stutter(String word) {
        return word.substring(0,2)+"... "+word.substring(0,2)+"... "+word+"?";
    }
}
