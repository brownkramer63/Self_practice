package edabit;

public class IntegerDigitCount {
    public static void main(String[] args) {
int n = 44949;
        System.out.println(count(n));
    }
    public static int count(int n) {
        if (n<0){
            String s=Integer.toString(n);
            return s.length()-1;
        }
String s=Integer.toString(n);
return s.length();
    }
}
