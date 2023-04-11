package practice03302023;

public class ReverseString {
    public static void main(String[] args) {
    char[] s={'h','e','l','l','0'};
    reverseString(s);
    }
    public static void reverseString(char[] s) {
        int counter = 0;
        char[] arr =new char[s.length];
        for (int i = s.length; i >0 ; i--) {
            arr[counter]=s[i-1];
            counter++;
        }
        for (int i = 0; i <s.length ; i++) {
            s[i]=arr[i];
        }
    }
}
