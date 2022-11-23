package CodingWars;

public class NotVerySecure {
    public static void main(String[] args) {

    }
    public static boolean alphanumeric(String s){
        if (s==""){
            return false;
        }
        if (s.contains(" ")){
            return false;
        }
        return true;
    }
}
