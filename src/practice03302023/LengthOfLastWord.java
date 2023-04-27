package practice03302023;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }
    public int lengthOfLastWord(String s) {
    s=s.trim();
    String[] arr = s.split(" ");
    String answer= arr[arr.length-1];
    return answer.length();

    }
}
